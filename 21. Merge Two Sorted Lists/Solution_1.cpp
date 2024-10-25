class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        // If list1 is empty, return list2
        if (list1 == NULL) {
            return list2;
        }
        // If list2 is empty, return list1
        if (list2 == NULL) {
            return list1;
        }

        // Create a dummy node to form the new merged list
        ListNode* dummy = new ListNode(0);
        ListNode* temp = dummy;

        // Traverse both lists and merge them
        while (list1 != NULL && list2 != NULL) {
            // Compare the values of list1 and list2 nodes
            // Attach the smaller value node to the merged list
            if (list1->val < list2->val) {
                temp->next = list1;
                list1 = list1->next; // Move to the next node in list1
            } else {
                temp->next = list2;
                list2 = list2->next; // Move to the next node in list2
            }
            temp = temp->next; // Move to the next node in the merged list
        }

        // If list1 has remaining nodes, attach them to the merged list
        while (list1 != NULL) {
            temp->next = list1;
            list1 = list1->next;
            temp = temp->next;
        }
        // If list2 has remaining nodes, attach them to the merged list
        while (list2 != NULL) {
            temp->next = list2;
            list2 = list2->next;
            temp = temp->next;
        }

        // Return the merged list, which starts at dummy's next node
        return dummy->next;
    }
};


/* 

Initial:
list1: 1 -> 2 -> 4
list2: 1 -> 3 -> 4
dummy: 0 -> NULL

Step 1:
temp: 0 -> 1 -> NULL
list1: 2 -> 4
list2: 1 -> 3 -> 4

Step 2:
temp: 0 -> 1 -> 1 -> NULL
list1: 2 -> 4
list2: 3 -> 4

Step 3:
temp: 0 -> 1 -> 1 -> 2 -> NULL
list1: 4
list2: 3 -> 4

Step 4:
temp: 0 -> 1 -> 1 -> 2 -> 3 -> NULL
list1: 4
list2: 4

Step 5:
temp: 0 -> 1 -> 1 -> 2 -> 3 -> 4 -> NULL
list1: NULL
list2: 4

Step 6:
temp: 0 -> 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> NULL
list1: NULL
list2: NULL

Final Merged List:
1 -> 1 -> 2 -> 3 -> 4 -> 4

*/