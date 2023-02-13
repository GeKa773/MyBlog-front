import users.User

interface UsersRepository {
    suspend fun fetchAllUsers(): List<User>
    suspend fun searchUser(login: String): User
}