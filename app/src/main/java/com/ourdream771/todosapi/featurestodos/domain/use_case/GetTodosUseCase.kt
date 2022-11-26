package com.ourdream771.todosapi.featurestodos.domain.use_case

import com.ourdream771.todosapi.featurestodos.core.Resource
import com.ourdream771.todosapi.featurestodos.domain.model.Todos
import com.ourdream771.todosapi.featurestodos.domain.repository.TodosRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject



class GetTodosUseCase @Inject constructor(
    private val todosRepository: TodosRepository
) {
    operator fun invoke(): Flow<Resource<List<Todos>>> = flow {
        try {
            emit(Resource.Loading<List<Todos>>())
            val todosList = todosRepository.getTodosLists().map { it }
            emit(Resource.Success<List<Todos>>(todosList))
        } catch(e: HttpException) {
            emit(Resource.Error<List<Todos>>(e.localizedMessage ?: "An unexpected error occured"))
        } catch(e: IOException) {
            emit(Resource.Error<List<Todos>>("Couldn't reach server. Check your internet connection."))
        }
    }
}
