<template>
  <v-container fluid class="pa-0 ma-0">
    <v-img
      class="imgFundoPrincipal"
      gradient="(200deg, rgba(0, 0, 0, 0) 0.50%, #000000 71.04%)"
    >
    <titulo class="pb-10"/>
    <obras
      class="pt-10"
      :obras="itemsUm"
      titulo="Compétences"
    />
    <obras
      class="pt-5"
      :obras="itemsDois"
      titulo="Projets"
    />
    <obras
      class="pt-5"
      :obras="itemsTres"
      titulo="Expériences professionnelles & Formations"
    />
    <Contact/>
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
          icon
        >
          <v-icon size="24px">
            {{ icon }}
          </v-icon>
        </v-btn>
      </v-card-text>

      <v-row class="caption font-weight-light pa-0 ma-0">
      <v-col cols="3">
        Audidescrição
      </v-col>
      <v-col cols="3">
        Central de ajuda
      </v-col>
      <v-col cols="3">
        Cartão pré-pago
      </v-col>
      <v-col cols="3">
        Imprensa
      </v-col>
      <v-col cols="3">
        Relação com investidores
      </v-col>
      <v-col cols="3">
        Carreiras
      </v-col>
      <v-col cols="3">
        Termos de uso
      </v-col>
      <v-col cols="3">
        Privacidade
      </v-col>
      <v-col cols="3">
        Avisos legais
      </v-col>
      <v-col cols="3">
        Preferência de cookies
      </v-col>
      <v-col cols="3">
        Informações corporativas
      </v-col>
      <v-col cols="3">
        Entre em contato
      </v-col>
      <v-col class="pa-2 ml-2 mt-5" cols="2" style="border: 1px solid #ccc; ">
        Código do serviço
      </v-col>
      <v-col cols="12">
        &copy; 1997-2023 Netflix, Inc.
      </v-col>
      </v-row>
    </v-card>
  </v-footer>
  </v-container>
</template>

<script>
import titulo from '../../components/titulo'
import obras from '../../components/obras'
import Contact from '../../components/Contact.vue'

export default {
  name: 'Home',

  components: {
    Contact,
    titulo,
    obras
  },

  data () {
    return {
      itemsUm: [
        {
          title: 'VueJS',
          image: 'https://i.pinimg.com/originals/60/17/da/6017da3ed8f203fe979b16dae1ad2259.png',
          isActive: true,
          class: 'enolaHolmes'
        },
        {
          title: 'PostgreSQL',
          image: 'https://wallpapercave.com/wp/wp13366604.jpg',
          isActive: false,
          class: 'bright'
        },
        {
          title: 'MySQL',
          image: 'https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/6284b53e-38f1-4d2e-81b4-f6a5c452f92f/d9o6y9z-cf5afefe-1429-4a32-9fcd-00d339205ae5.png/v1/fill/w_1024,h_576,q_80,strp/mysql_wallpaper_by_milesandryprower_d9o6y9z-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NTc2IiwicGF0aCI6IlwvZlwvNjI4NGI1M2UtMzhmMS00ZDJlLTgxYjQtZjZhNWM0NTJmOTJmXC9kOW82eTl6LWNmNWFmZWZlLTE0MjktNGEzMi05ZmNkLTAwZDMzOTIwNWFlNS5wbmciLCJ3aWR0aCI6Ijw9MTAyNCJ9XV0sImF1ZCI6WyJ1cm46c2VydmljZTppbWFnZS5vcGVyYXRpb25zIl19.8AQOmRMLqu6QRWlfwLUYsluDbcL2GN2sBfOIDbK8VFk',
          isActive: false,
          class: 'strangerThings'
        },
        {
          title: 'JavaScript',
          image: 'https://e0.pxfuel.com/wallpapers/210/608/desktop-wallpaper-programming-javascript-javascript-code.jpg',
          isActive: false,
          class: 'te'
        },
        {
          title: 'Python',
          image: 'https://c4.wallpaperflare.com/wallpaper/645/96/47/python-programming-programming-programming-language-code-hd-wallpaper-preview.jpg',
          isActive: false,
          class: 're'
        },
        {
          title: 'Java',
          image: 'https://i.redd.it/b5murfp45i861.png',
          isActive: false
        },
        {
          title: 'C++',
          image: 'https://i.pinimg.com/originals/9b/6e/fe/9b6efe430ed7a89b0f31832b971cf1c6.jpg',
          isActive: false
        },
        {
          title: 'TypeScript',
          image: 'https://e0.pxfuel.com/wallpapers/204/537/desktop-wallpaper-what-is-typescript.jpg',
          isActive: false
        },
        {
          title: 'NodeJS',
          image: 'https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/i/a02af52b-2b04-4534-ad4e-f98688ceb85e/db4e1ip-ce5b9423-400d-4442-8dd8-a9f42717c6c9.png',
          isActive: false
        },
        {
          title: 'Unity',
          image: 'https://forum.unity.com/attachments/unity2-png.180372/',
          isActive: false
        },
        {
          title: 'MongoDB',
          image: 'https://webimages.mongodb.com/_com_assets/cms/kuzt9r42or1fxvlq2-Meta_Generic.png',
          isActive: false
        },
        {
          title: 'HTML / CSS',
          image: 'https://wallpapercave.com/wp/wp2742499.jpg',
          isActive: false
        }
      ],
      itemsDois: [
        {
          title: 'LongCours',
          image: '/LongCours.jpg',
          isActive: false
        },
        {
          title: 'PokedexVueJS',
          image: 'https://screenshots.codesandbox.io/q6w3f/12.png',
          isActive: false
        },
        {
          title: 'SQLRocketLeague',
          image: './SqlRL.jpg',
          isActive: false
        },
        {
          title: 'CQLD',
          image: './CQLD.png',
          isActive: false
        },
        {
          title: 'ArtVR',
          image: './ArtVR.jpg',
          isActive: false
        },
        {
          title: 'Donde Esta La Biblioteca',
          image: './DONDE_ESTA_LA_BIBLIOTECA.jpg',
          isActive: false
        },
        {
          title: 'Portfolio',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABRHacg_vOuBxv1TYiWOQ7rylV0mhRzhs15bI8BOfx0vuqovXrM8o5N9ycYPEEHMDCLxxY94HPxsuuvWA_EGrd1aAz9KrFbJ6vujJjEtkKYF2AJTFozs8GsU2nkHp2UlvT3JF09nz9WjXywApidr-QtMTxpa5Foob4MU.webp?r=b9c',
          isActive: false
        },
        {
          title: 'PPCC',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABS1l__N3JrgFdHmg40AWNJJme3v5PvMqQ4CKPfIAEKB4_jmHrn8ev-vWzouldI8KU5sZTHOwOlvE6C_MZJpiu7jAd3n7Ol42tAeDDmcYS8-FacPFbUDyv487o2I8QNYbbAJx.jpg?r=2c4',
          isActive: false
        }
      ],
      itemsTres: [
        {
          title: 'Norpaper Saisonier',
          image: './Norpaper_saisonnier.png',
          isActive: false
        },
        {
          title: 'Stage',
          image: './stage.jpg',
          isActive: false
        },
        {
          title: 'Alternance',
          image: './alternance.jpg',
          isActive: false
        },
        {
          title: 'Baccalauréat',
          image: './bac.jpg',
          isActive: false
        },
        {
          title: 'BUT INFO',
          image: './BUT.jpg',
          isActive: false
        },
        {
          title: 'MyDigitalSchool',
          image: './mba.jpg',
          isActive: false
        }
      ],
      icons: [
        'mdi-facebook',
        'mdi-twitter',
        'mdi-linkedin',
        'mdi-instagram'
      ]
    }
  }
}
</script>

<style>
.imgFundoPrincipal {
  background:
  linear-gradient(212.38deg, rgba(0, 0, 0, 0) 0.53%, #000000 71.04%),
  linear-gradient(269.78deg, #000000 -1.71%, rgba(0, 0, 0, 0) -1.7%,rgba(0, 0, 0, 0.85) 99.81%),
  url("../../../public/imageprincipal.jpg");
  background-repeat: no-repeat;
  background-size: cover;
  height: 100%;
  width: 100%;
}
</style>
