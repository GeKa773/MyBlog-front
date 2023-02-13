import ktor.KtorUsersDataSource
import org.kodein.di.*
import sqldelight.SqlDelightUserDataSource

val usersModule = DI.Module("usersModule") {

    bind<KtorUsersDataSource>() with provider {
        KtorUsersDataSource(instance())
    }

    bind<SqlDelightUserDataSource>() with provider {
        SqlDelightUserDataSource()
    }

    bind<UsersRepository>() with singleton {
        UsersRepositoryImpl(instance(), instance())
    }
}