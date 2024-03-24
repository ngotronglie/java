package dogmanagement;

import data.Dog;

public class DogManagement {
    public static void main(String[] args) {
        // lấy khuôn dog ra để bắt đầu đổ infor <> i chang đi làm thẻ căn cước
        // sau khi chờ khô , ta được object thuộc nhóm vừa đúc
        // đặt tên gọi tắt cho obj để dễ dàng nói chuyện, tham chiếu đến
        Dog chiHu  = new Dog("Ngo Trong Liem", 2024, 19.5);
        // biến / tên tắt   object
        // có object sẽ biết làm gì đó, c hó biết sủa
        chiHu.bark();
    }
}

/**
 * - object n value phuc tap laf 1 vat the, thu gi do , thing mà có dd , hv
 * là những thứ ta có thể đếm dc , sờ dc, mô tả và phân biệt được
 *
 *
 * - class là sự phân nhóm, tên gọi 1 nhóm các đối tượng theo 1 tiêu chí nào đó
 *      tiêu chí: hát -> nhóm ca sĩ
 *      tiêu chí: đóng phim -> nhóm diễn viên
 *
 *
 * - có nhiều đối tượng xuất hiện, gom nhóm dc rồi thành class
 *          -> làm sao lưu trữ, quản lí và xử lí, ...
 *
 *
 * - oop giống y chang kĩ thuật đúc tượng, muốn làm object nào thì ta tạo khuôn cho nhóm object đó / class đó, class Cup
 *  khuôn cái lưu được infor vác ca sĩ < template class singer>
 *      từ object tạo khuôn, sau này đúc trở thành object
 *
 */