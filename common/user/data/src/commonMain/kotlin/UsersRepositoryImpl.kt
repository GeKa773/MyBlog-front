import ktor.KtorUsersDataSource
import sqldelight.SqlDelightUserDataSource
import users.User

class UsersRepositoryImpl(
    private val remoteDataSource: KtorUsersDataSource,
    private val localDataSource: SqlDelightUserDataSource
) : UsersRepository {
    override suspend fun fetchAllUsers(): List<User> {
        return remoteDataSource.fetchAllUsers()
    }

    override suspend fun searchUser(login: String): User {
        return remoteDataSource.searchUser(login)
    }

}