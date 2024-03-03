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

}


//code bên ngoài giống khung bị lủng