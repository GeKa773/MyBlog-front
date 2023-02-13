package ktor

import io.ktor.client.*
import users.User

class KtorUsersDataSource(val httpClient: HttpClient) {
    suspend fun fetchAllUsers(): List<User> {
        return emptyList()
    }

    suspend fun searchUser(login: String): User {
        return User("Test", "Test test", "Test@Gmail.com", null)
    }
}