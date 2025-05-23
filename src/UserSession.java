public class UserSession {
    // Biến tĩnh private để đếm số người dùng online
    private static int onlineCount = 0;

    // Hàm tạo tăng onlineCount khi một người dùng đăng nhập
    public UserSession() {
        onlineCount++;
    }

    // Phương thức giảm onlineCount khi người dùng đăng xuất
    public void logout() {
        if (onlineCount > 0) {
            onlineCount--;
        }
    }

    // Phương thức tĩnh trả về số người dùng online
    public static int getOnlineCount() {
        return onlineCount;
    }

    // Chương trình chính để mô phỏng
    public static void main(String[] args) {

        // Mô phỏng 3 người dùng đăng nhập
        System.out.println("\nThree users logging in:");
        UserSession user1 = new UserSession();
        System.out.println("After user1 logs in: " + getOnlineCount());
        UserSession user2 = new UserSession();
        System.out.println("After user2 logs in: " + getOnlineCount());
        UserSession user3 = new UserSession();
        System.out.println("After user3 logs in: " + getOnlineCount());

        // Mô phỏng 1 người dùng đăng xuất
        System.out.println("\nOne user logging out:");
        user2.logout();
        System.out.println("After user2 logs out: " + getOnlineCount());
    }
}
