class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        Queue<Integer> queue = new LinkedList<>();

        for( int student : students) {
            queue.add(student);
        }

        int sandwichIndex = 0;
        int rotations = 0;

        while (!queue.isEmpty()) {

            if(queue.peek() == sandwiches[sandwichIndex]) {
                queue.poll();
                sandwichIndex++;
                rotations = 0;
            }
            else{
                queue.add(queue.poll());
                rotations++;

                if(rotations == queue.size()) {
                    break;
                }
            }
        }
        return queue.size();
    }
}