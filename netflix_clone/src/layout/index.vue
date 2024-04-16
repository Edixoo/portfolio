<script setup>
import { onMounted, ref } from 'vue'

const headerHeight = ref(0)

onMounted(() => {
  headerHeight.value = document.querySelector('v-app-bar').offsetHeight
})

function navigationOnClick (id) {
  const element = document.getElementById(id)
  window.scrollTo({
    top: element.offsetTop - headerHeight.value,
    behavior: 'smooth'
  })
}
</script>

<template>
  <v-main class="pa-0 ma-0">
    <v-app-bar
      app
      color="black"
      class="elevation-0"
    >
    <v-app-bar-nav-icon
      class="mx-16 pl-9"
      disabled
      >
        <v-img
          :src="require('../assets/fontbolt.png')"
          contain
          width="120"
        />
      </v-app-bar-nav-icon>

      <v-btn text small :ripple="false" @click="navigationOnClick('profil')">
        Profil
      </v-btn>

      <v-btn text small :ripple="false" @click="navigationOnClick('comp')">
        Compétences
      </v-btn>

      <v-btn text small :ripple="false" @click="navigationOnClick('projets')">
        Projets
      </v-btn>

      <v-btn text small :ripple="false" @click="navigationOnClick('xp')">
        Expériences Professionelles & Formations
      </v-btn>

      <v-btn text small :ripple="false" @click="navigationOnClick('contact')">
        Contact
      </v-btn>

      <v-spacer></v-spacer>

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
