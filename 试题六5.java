class WorkExperience implements Cloneable {
    private String workDate;
    private String company;
    public Object Clone(){
        WorkExperience obj = new WorkExperience();
        obj.workDate = this.workDate;
        obj.company = this.company;
        return obj;
    }
}

class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience work ;
    public Resume(String name){
        this.name = name;
        work = new WorkExperience();
    }
    private Resume(WorkExperience work){
        this.work =(WorkExperience) work.Clone();
    }
    public Object Clone(){
        Resume obj = new Resume(this.work);
        return obj;
    }
}