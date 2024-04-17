<script setup>
import { competences, projets, experiences } from '@/common/data'
import { onMounted, onUnmounted, ref, watch } from 'vue'

const props = defineProps({
  item: {
    required: true,
    type: Object
  }
})

const currentItem = ref(null)

onMounted(() => {
  if (props.item) currentItem.value = props.item
})

onUnmounted(() => {
  currentItem.value = null
})

watch(() => props.item, (newVal) => {
  currentItem.value = newVal
})

const getCompList = (listCompetences) => {
  const competenceslist = []
  listCompetences.forEach((comp) => {
    competenceslist.push(competences.find((c) => c.title === comp))
  })
  return competenceslist
}

const getProjectsList = (listProjets) => {
  const projetsList = []
  listProjets.forEach((proj) => {
    projetsList.push(projets.find((p) => p.title === proj))
  })
  return projetsList
}

const getXpList = (listXp) => {
  const xpList = []
  listXp.forEach((xp) => {
    xpList.push(experiences.find((x) => x.title === xp))
  })
  return xpList
}
</script>

<template>
  <v-card color="#181818" class="cardPrinc">
    <v-img :src="currentItem.image" gradient="0deg, #181818, transparent 50%" class="imageFond">
      <v-col class="title">
        <v-img :src="currentItem.logo" class="imagelogo" v-if="currentItem.logo"/>
          <v-card-title class="white--text logotext" v-else>{{ currentItem.title }}</v-card-title>

        <v-btn v-if="currentItem.lien" :href="currentItem.lien" color="red">
          <v-icon>mdi-play</v-icon>
          <span>Voir le projet</span>
        </v-btn>
      </v-col>
    </v-img>

    <v-card-text>
      <v-row>
        <v-col :cols="(currentItem.team  || currentItem.date) ? '8' : '12'">
          <v-card-title class="white--text">Description</v-card-title>
          <v-card-text class="white--text">{{ currentItem.description }}</v-card-text>
        </v-col>
        <v-col cols="4" v-if="currentItem.team  || currentItem.date">
          <v-card-text v-if="currentItem.team">
            <span>
              Équipe : {{ currentItem.team }}
            </span>
          </v-card-text>
          <v-card-text v-if="currentItem.date">
            <span>
              Date : {{ currentItem.date[0] + ' - ' + (currentItem.date[1] || 'Maintenant') }}
            </span>
          </v-card-text>
        </v-col>
      </v-row>
    </v-card-text>

    <v-card-actions>
    <v-col>
      <div v-if="currentItem.liaison && currentItem.liaison.competences">
        <v-card-title class="white--text">Compétences utilisées</v-card-title>
        <div class="containerLiaison">
          <div v-for="liaison in getCompList(currentItem.liaison.competences)" :key="liaison.title">
            <v-img
              v-if="liaison.image"
              :src="liaison.image"
              class="imgActions"
              @click="() => $emit('dialogActivate', liaison)"
              contain
            />
          </div>
        </div>
      </div>

      <div v-if="currentItem.liaison && currentItem.liaison.projets">
        <v-card-title class="white--text">Projets</v-card-title>
        <div class="containerLiaison">
          <div v-for="liaison in getProjectsList(currentItem.liaison.projets)" :key="liaison.title">
            <v-img
              v-if="liaison.image"
              :src="liaison.image"
              class="imgActions"
              @click="() => $emit('dialogActivate', liaison)"
              contain
            />
          </div>
        </div>
        </div>
      <div v-if="currentItem.liaison && currentItem.liaison.experiences">
          <v-card-title class="white--text">Expériences</v-card-title>
          <div class="containerLiaison">
            <div v-for="liaison in getXpList(currentItem.liaison.experiences)" :key="liaison.title">
              <v-img
                v-if="liaison.image"
                :src="liaison.image"
                class="imgActions"
                @click="() => $emit('dialogActivate', liaison)"
                contain
              />
            </div>
          </div>
      </div>
    </v-col>
    </v-card-actions>
  </v-card>
</template>

<style scoped>

.cardPrinc {
  border-radius: 0;
  width: 1000px;

  .imageFond {
    border-radius: 0;
    position: relative;
    .title {
      position: absolute;
      bottom: 0;
      left: 0;
      margin-bottom: 30px;
      margin-left: 20px;

      .imagelogo {
        width: 300px;
        margin-bottom: 30px;
        padding: 0;
      }

      .logotext {
        margin-bottom: 30px;
        font-size: 50px;
        padding: 0;
        font-weight: 700;
      }
    }
  }

  .containerLiaison {
    display: flex;
    flex-wrap: wrap;
    gap: 10px;
    justify-content: center;

    .imgActions {
      height: 200px;
      width: 285px;
    }
    .imgActions:hover {
      transform: scale(1.1);
      cursor: pointer;
    }
  }
}
</style>
