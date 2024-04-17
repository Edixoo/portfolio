<template>
  <v-container fluid class="pa-0 ma-0">
    <v-img
      class="imgFundoPrincipal"
      gradient="(200deg, rgba(0, 0, 0, 0) 0.50%, #000000 71.04%)"
    >
      <v-row class="align-center">
        <v-col>
          <titulo id="profil"/>
        </v-col>
      <v-col>
        <v-img
          class="profilPicture"
          width="300"
          height="300"
          src='profilPicture.jpg'
        />
      </v-col>

      </v-row>
    <obras
      class="pt-10"
      :obras="competences"
      titulo="Compétences"
      id="comp"
    />
    <obras
      class="pt-5"
      :obras="projets"
      titulo="Projets"
      id="projets"
    />
    <obras
      class="pt-5"
      :obras="experiences"
      titulo="Expériences professionnelles & Formations"
      id="xp"
    />
    <Contact id="contact"/>
    </v-img>
    <v-footer
    padless
    color="black"
    class="d-flex justify-center"
  >
  <v-card
      flat
      tile
      color="black"
      width="60%"
      class="secondary--text text-start"
    >
      <v-card-text>
        <v-btn
          v-for="icon in icons"
          :key="icon"
          class="mx-4 white--text"
          :href="icon.link"
          icon
        >
          <v-icon size="24px">
            {{ icon.name }}
          </v-icon>
        </v-btn>
      </v-card-text>

      <v-row class="caption font-weight-light pa-0 ma-0">
      <v-col cols="12">
        &copy; 2003-2024 Paul Pruvost.
      </v-col>
      </v-row>
    </v-card>
  </v-footer>
  </v-container>
</template>

<script setup>
import titulo from '../../components/titulo'
import obras from '../../components/obras'
import Contact from '../../components/Contact.vue'
import { competences, experiences, projets } from '@/common/data'

const icons = [
  {
    name: 'mdi-linkedin',
    link: 'https://www.linkedin.com/in/paul-pruvost/'
  }
]

</script>

<style>
.imgFundoPrincipal {
  background:
  linear-gradient(212.38deg, rgba(0, 0, 0, 0) 0.53%, #000000 71.04%),
  linear-gradient(269.78deg, #000000 -1.71%, rgba(0, 0, 0, 0) -1.7%,rgba(0, 0, 0, 0.85) 99.81%),
  url("../../../public/imagefond.jpg");
  background-repeat: no-repeat;
  background-size: cover;
  height: 100%;
  width: 100%;
}

.profilPicture {
  border-radius: 50%;
  margin-left: 40%;
  margin-top: 10%;
}
</style>
