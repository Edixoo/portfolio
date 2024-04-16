<template>
  <div class="ml-16 horizontal-scroll" @keyup.right="nextPage" @keyup.left="prevPage" @mousewheel.right="nextPage">
        <v-card-title class="font-weight-bold pr-5 ma-0" style="color: #e5e5e5; font-size: 27px !important;">{{ titulo }}</v-card-title>
        <v-carousel
          show-arrows-on-hover
          hide-delimiters
          :height="220"
          style="white-space: nowrap; display: inline-block;"
          @change="nextPage()"
        >
          <v-carousel-item
            v-for="(el, index) in slider"
            :key="index"
          >
            <div class="d-flex align-center pa-0 ma-0" style="white-space: nowrap; display: inline-block;">
              <v-card v-for="(item, index) in items" :key="index" class="elevation-0 pa-0 ma-0" color="#e5e5e500">
              <v-img
                v-if="item.image"
                :src="item.image"
                height="200"
                @click="dialogActivate(item)"
                width="285"
                contain
                class="d-flex align-center mx-1 cursor-pointer imgJanela"
                @mouseover="item.isActive = true"
                @mouseout="item.isActive = false"
              >
              </v-img>

          </v-card>
        </div>
          </v-carousel-item>
  </v-carousel>

    <v-dialog v-model="viewDetail" width="auto">
      <details-card :item="currentItem"/>
    </v-dialog>
</div>
</template>

<script setup>
import { reactive, onMounted, ref } from 'vue'
import DetailsCard from '@/components/detailsCard.vue'

const props = defineProps({
  obras: {
    required: true,
    type: Array
  },
  titulo: {
    required: true,
    type: String
  }
})

const viewDetail = ref(false)
const items = ref([])
const slider = reactive([1, 2, 3])
const currentItem = ref(null)

const dialogActivate = (item) => {
  currentItem.value = item
  viewDetail.value = true
}

onMounted(() => {
  if (props.obras && props.obras.length) items.value = props.obras
})

function prevPage () {
  for (let x = 0; x <= 6; x++) {
    items.value.unshift(items.value.pop())
  }
}

function nextPage () {
  for (let x = 0; x <= 5; x++) {
    items.value.push(items.value.shift())
  }
}
</script>

<style scoped>
.cursor-pointer {
  cursor: pointer;
}
.imgJanela {
  padding: 0px 5px 0px 0px;
  border-radius: 5px;
  transition: 0.2s;
}

.imgJanela:hover {
    transform: scale(1.1);
}
</style>
