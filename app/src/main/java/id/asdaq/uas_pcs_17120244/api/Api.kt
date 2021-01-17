package id.asdaq.uas_pcs_17120244.api


import id.asdaq.uas_pcs_17120244.data.model.DetailUserResponse
import id.asdaq.uas_pcs_17120244.data.model.User
import id.asdaq.uas_pcs_17120244.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token fc75e127e02c929b32358a3c803bd36bdf90ecc7")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token fc75e127e02c929b32358a3c803bd36bdf90ecc7")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token fc75e127e02c929b32358a3c803bd36bdf90ecc7")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token fc75e127e02c929b32358a3c803bd36bdf90ecc7")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}