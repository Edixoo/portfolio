<template>
  <div class="ml-16 horizontal-scroll">
    <v-card-title class="font-weight-bold pr-5 ma-0" style="color: #e5e5e5; font-size: 27px !important;">Contactez-moi</v-card-title>
    <div class="contact__formulaire">
      <v-form ref="form" action="https://formspree.io/f/mayrlgra" method="post" class="formulaire">
        <v-text-field
          label="E-mail"
          class="mailClass"
          :rules="[mailverif, required]"
          type="email"
          name="email"
        />
        <v-textarea
          label="Message"
          class="mailClass"
          :rules="[required]"
          name="message"
        />
        <v-btn @click="submitForm" color="red" class="buttonSubmit">Envoyer</v-btn>
      </v-form>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const mailverif = (v) => {
  return /.+@.+\..+/.test(v) || 'E-mail must be valid'
}

const required = (v) => {
  return !!v || 'Field is required'
}

const form = ref(null)

const submitForm = () => {
  if (form.value.validate()) {
    form.value.$el.submit()
  }
}
</script>

<style scoped>

.formulaire {
  width: 50%;
  margin: auto;

  .mailClass {
    width: 80%;
  }

  .buttonSubmit {
    margin-left: 65%;
    margin-top: 2em;
    margin-bottom: 50px;
  }
}
</style>
