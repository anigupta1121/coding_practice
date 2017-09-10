package practice;

import java.util.*;

class Student  {
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> qu=new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
        Iterator<String> it=events.listIterator();
        while(it.hasNext()){
            String args[]=it.next().split(" ");
            if(args[0].equals("SERVED")){
                if(!qu.isEmpty()){
                    qu.poll();
                }else{
                    System.out.println("EMPTY");
                }
            }else{
              //  qu.add(new Student(Integer.parseInt(args[3]),args[1],Double.parseDouble(args[2])));
            }

        }
        List<Student> st=new ArrayList<>();
        Iterator<Student> it2=qu.iterator();
        while(it2.hasNext()){
            st.add(it2.next());
        }

        return st;
    }
}