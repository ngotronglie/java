package data;

// khuôn dùng để đúc ra các object , đối tượng cần lưu trữ info, làm ra . khuôn phải kín, có phễu để rót data vào

public class Dog {
    // chứa đăck điểm, chi tiết cái khuôn, object tương lai sẽ có
    // khuôn design ra sao,  mai mốt thế nào

    private String name;
    private int yob;
    private double weight;
    //...

//    có khuôn thì phải có phễu để hứng vật liệu đi vào
    // phễu dùng để nhận vật liệu đúc ra , tạo ra  , contruct cái object

    public Dog(String Iname , int Iyob , double Iweight){
        name = Iname;
        yob = Iyob;
        weight = Iweight;
    }


    /**
     *  phễu còn gọi là contructor , hàm khởi tạo , hàm đúc , hàm tạo dựng
     *  ra object vì thông qua nó như phễu vật liệu chảy vào trong khu vật liệu khô ra object/ bức tượng ,cmnd của ai
     *  hồ sơ được tạo ra
     *  CONTRUCTOR, phễu là hàm cực kì đặc biệt , vì nó dùng để tạo ra 1 obj  cứ mỗi lần xài nó ta cần phải đưa vật liệu vào
     *  tức là 1 obj mới
     *  phễu là hàm ĐB không giá trị trả về , không void luôn
     *
     *     lưu ý : tên phải giống với class
     */


    /**
     * viết các hàm xử lí data , ví dụ giao tiếp nhau để hỏi năm sinh
     * mày hỏi tao trả lời , vì ba má đã fill yob = 2001
     * object thì gọi là hành động, behaviour, xử lí tính toán trên biến được đổ value từ lúc đúc ra
     */

    // hàm gọi n lần tương đương các hành động mà obj nào đó lặp đi lặp lại
    // hành động obj gọi n lầ trên obj đó
    public void bark(){ // hành động
        System.out.println("gau gau gau ... my name is " + name);
        System.out.println("gau gau gau ... my yob is " + yob);
    }


}

//code bên ngoài giống khung bị lủng

// ngoài đời bạn (yob: 2004) , tui (yob:2004, )