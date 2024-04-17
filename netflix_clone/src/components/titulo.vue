<template>
  <div class="ml-16">
    <v-row>
      <v-col cols="12">
        <h1 class="display-1 font-weight-bold"
        style="margin-top: 10%;
        max-width:600px;
        max-height:400px;
        width: auto;
        height: auto;
        font-size: 200%;">Paul Pruvost</h1>
      </v-col>

      <v-col cols="12" class="d-flex flex-row ma-0 pa-0">
            <v-btn
              icon
              color="primary"
            >
              <v-icon>mdi-star</v-icon>
            </v-btn><v-btn
              icon
              color="primary"
            >
              <v-icon>mdi-star</v-icon>
            </v-btn><v-btn
              icon
              color="primary"
            >
              <v-icon>mdi-star</v-icon>
            </v-btn><v-btn
              icon
              color="primary"
            >
              <v-icon>mdi-star</v-icon>
            </v-btn><v-btn
              icon
              color="primary"
            >
              <v-icon>mdi-star</v-icon>
            </v-btn>
            <p class="pa-0 ml-3 mt-2 mb-0 font-weight-light">2003 (20 ans) </p>
            <p class="pa-0 ml-3 mt-2 mb-0 font-weight-light">BAC +3</p>
            <v-chip
              class="mt-2 mb-0 ml-3 "
              small
            >
              Permis de conduire
            </v-chip>
            <v-chip
              class="ml-3 mt-2 mb-0"
              small
            >
              Anglais B2
            </v-chip>
      </v-col>

      <v-col cols="12">
        <p class="subheading font-weight-regular">
          Bonjour ! Je m'appelle Paul Pruvost, j'ai 20 ans. Je suis un développeur FullStack JS.
          Je suis passionné par le développement web et j'ai une expérience de 1 an dans celui-ci.
          Je suis actuellement en recherche d'une alternance de 2 ans en tant que développeur FullStack.
          Je suis disponible dès maintenant.
        </p>
      </v-col>

      <v-col
        cols="12"

      >
        <v-btn
          class="black--text mr-2"
          color="white"
          @click="navigationOnClick('contact')"
        >
          <v-icon color="black">mdi-play</v-icon>
            Contactez-moi
        </v-btn>
        <v-btn
          color="red"
          href="cv.pdf"
        >
          <v-icon>mdi-download</v-icon>
            Télécharger CV
        </v-btn>
      </v-col>
    </v-row>
  </div>
</template>

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
