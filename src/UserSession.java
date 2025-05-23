public class UserSession {
    private static int onlineCount = 0;

    public UserSession() {
        onlineCount++;
    }

    public void logout() {
        if (onlineCount > 0) {
            onlineCount--;
        }
    }

    public static int getOnlineCount() {
        return onlineCount;
    }

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
