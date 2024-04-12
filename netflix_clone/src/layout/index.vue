<template>
  <v-main class="pa-0 ma-0">
    <v-app-bar
      app
      color="black"
      class="elevation-0"
    >
    <v-app-bar-nav-icon
      class="mx-16 pl-9"
      >
        <v-img
          :src="require('../assets/fontbolt.png')"
          contain
          width="120"
        />
      </v-app-bar-nav-icon>

      <v-btn text small :ripple="false">
        Profile
      </v-btn>

      <v-btn text small :ripple="false">
        Compétences
      </v-btn>

      <v-btn text small :ripple="false">
        Projets
      </v-btn>

      <v-btn text small :ripple="false">
        Expériences Professionelles & Formations
      </v-btn>

      <v-btn text small :ripple="false">
        Contact
      </v-btn>

      <v-spacer></v-spacer>

      <v-btn icon>
        <v-icon>mdi-magnify</v-icon>
      </v-btn>

      <v-btn text small :ripple="false">
        Infantil
      </v-btn>

      <v-btn icon>
        <v-icon>mdi-bell</v-icon>
      </v-btn>

      <v-btn icon :ripple="false">
        <v-img
        :src="require('../assets/perfi.jpg')"
        contain
        height="40"
      />
      </v-btn>
    </v-app-bar>
    <v-container
      class="pa-0"
      fluid
    >
    <router-view/>
    </v-container>
  </v-main>
</template>

<script>
export default {
  name: 'App',

  data: () => ({
    //
  })
}
/* eslint-disable */
</script>
