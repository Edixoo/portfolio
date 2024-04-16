<script setup>

defineProps({
  item: {
    required: true,
    type: Object
  }
})
</script>

<template>
<v-card>
<v-img
  :src="item.image"
  gradient="(to bottom, rgba(0,0,0,0) 0%, rgba(0,0,0,1) 100%)"
  contain
  />
</v-card>
</template>

<style scoped>

v-card {
  max-width: 100px;
  max-height: 300px;

  v-img {
    background-size: cover;
    width: 100%;
    position: absolute;
    background: linear-gradient(to bottom, rgba(0,0,0,0) 0%, rgba(0,0,0,1) 100%);
  }
}
</style>
