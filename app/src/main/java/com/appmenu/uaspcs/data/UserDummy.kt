package com.appmenu.uaspcs.data

object UserDummy {
    val list: ArrayList<User>
    get() {
        val list = arrayListOf<User>()

        list.add(User(
            "sidiqpermana",
            "https://avatars1.githubusercontent.com/u/4090245?v=4",
            "https://github.com/sidiqpermana",
            "https://api.github.com/users/sidiqpermana/followers",
            followers = 15,
            "https://api.github.com/users/sidiqpermana/following{/other_user}",
            following = 10,
            "https://api.github.com/users/sidiqpermana/repos",
            repos = 10
        ))

        list.add(User(
            "sidiqpermana2",
            "https://avatars3.githubusercontent.com/u/18606835?v=4",
            "https://github.com/sidiqpermana22",
            "https://api.github.com/users/sidiqpermana22/followers",
            followers = 15,
            "https://api.github.com/users/sidiqpermana22/following{/other_user}",
            following = 10,
            "https://api.github.com/users/sidiqpermana22/repos",
            repos = 10
        ))

        return list
    }
}