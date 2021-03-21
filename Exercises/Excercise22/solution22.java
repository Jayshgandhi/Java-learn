import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
    String student_name;
    Integer student_mark;
    public Student(String s,Integer r){
        this.student_name=s;
        this.student_mark=r;

    }
    public void setStudent_mark(Integer student_mark) {
        this.student_mark = student_mark;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Integer getStudent_mark() {
        return student_mark;
    }

    public String getStudent_name() {
        return student_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_name='" + student_name + '\'' +
                ", student_mark=" + student_mark +
                '}';
    }
}
class JavaStreamAdvanceWorker{
    public boolean odd_Or_Even(Integer o) {
        if(o%2==1)
            return true;
        else
            return false;
    }
    public Integer cube(Integer n){

        return n*n*n;
    }
    public List<String> passMark(List<Student> d,Integer passMarkThreshold){

        List<String> res = d.stream().filter(v ->v.student_mark>passMarkThreshold).map(v -> v.getStudent_name()).collect(Collectors.toList());
        return res;

    }
    public Optional<Student> firstRankStudent(List<Student> r){
        Optional<Student> fr = r.stream().max((o1, o2) -> o1.student_mark.compareTo(o2.student_mark));
        return fr;
    }
    public List<String> numberOfFailures(List<Student> d,Integer passMarkThreshold){

        List<String> res = d.stream().filter(s ->s.student_mark<passMarkThreshold).map(v->v.getStudent_name()).collect(Collectors.toList());
        return res;

    }
    public void printlastFiveStudents(List<Student> s){
        List<Student> gt =s.subList(Math.max(s.size()-5,0), s.size());
        System.out.println("Last five elements"+gt.toString());
    }
    public boolean checkAllPass(List<Student> d,Integer passMarkThreshold){

        return d.stream().allMatch(n->n.getStudent_mark()<passMarkThreshold);

    }
    public Map<Boolean,List<Student>> seperateStudents(List<Student>s, Integer passMarkThreshold){
        Map<Boolean, List<Student> >
                map = s.stream().collect(
                Collectors.partitioningBy(n -> n.getStudent_mark() > passMarkThreshold));
        return map;
    }
}

public class solution22 {
    public static void main(String[] args) {
        List<Student> sd = new ArrayList<Student>();
        List<Integer> in =new ArrayList<>();
        Name_generator ex = new Name_generator();
        Random rd = new Random();
        for(int i=1;i<=100;i++){

            in.add(rd.nextInt((100 - 1) + 1) + 1);
            sd.add(new Student(ex.name_Suggestor(8), rd.nextInt((100 - 1) + 1) + 1));

        }

        JavaStreamAdvanceWorker vj = new JavaStreamAdvanceWorker();
        List<String> end = vj.passMark(sd,55);
        List<String> fail = vj.numberOfFailures(sd,55);
        System.out.println("Students who has passed:"+end.toString());
        System.out.println(vj.firstRankStudent(sd));
        System.out.println("Students who has failed:"+fail.toString());
        vj.printlastFiveStudents(sd);
        System.out.println(vj.checkAllPass(sd,55));
        System.out.println(vj.seperateStudents(sd,55));
    }
}
