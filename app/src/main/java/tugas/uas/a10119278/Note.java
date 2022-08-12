package tugas.uas.a10119278;

/*
NIM     : 10119278
Nama    : Nadia Siti Fatimah
Kelas   : IF-7
*/

public class Note {
    private long ID;
    private String title;
    private String category;
    private String content;
    private String date;
    private String time;

    public Note(){ }
    public Note(String title, String content, String category, String date, String time){
        this.title = title;
        this.content = content;
        this.category = category;
        this.date = date;
        this.time = time;
    }
    public Note(long id, String title, String content, String category, String date, String time){
        this.ID = id;
        this.title = title;
        this.content = content;
        this.category = category;
        this.date = date;
        this.time = time;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}