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
    <obras
      class="pt-5"
      :obras="itemsCinco"
      titulo="Langues"
    />
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

export default {
  name: 'Home',

  components: {
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
          title: 'Filme 1',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABZLhJbv3Xm860mGDXRvAWh55aG37qBtmvoklZWWAkZnvU2ySXdqzxTDhfweL5ctCtzxo-POu8wP5fJ4UXQFFPg_95UAYHtKCo-SqhRlg8ulZQ5YaftxAw_81uWUTW7U_cRqyhueuU1PGONSlY4-RA2mKjDezbbM1LBpl1BdsyPbQEMRqLGT9F2BTvRxmIQ-xATMY9yyw28d99yobpJBPHzCTZ8n2ett9qYSxKf3weUNH53M0coicuKEvc9_Nh1PnZTQHOx5R3s0su-xQF-rVpJr7OU9a4dzQDE9E7sCXI7UaL6DextRQ2Cma9MveBVyKV_RzdZlq7_2h01MY8awTGOITrnpCtVxYC2G1Cc7mXCRZI2qj77U.jpg?r=6f9',
          isActive: false
        },
        {
          title: 'Filme 2',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABaobMsdL6ejvTg8B69xj5nl9-JBp_VwbGZI2sFTe7UL5Mka2Hq1drM6wJ8YbpsrcZrchclDJNCZ-yon3WN6-G1sTQ-RpzDx-D0g.webp?r=422',
          isActive: false
        },
        {
          title: 'Filme 3',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABWfd_wVcG1RCNLvADPocoeNA4mOyZniNN4dpnqRyFqN_QYT5JxIFBZb3AlDVuJJVWbF8FKVZTxTzop3Ni-PohyWTKQ_5T9onM6wiEIjyjUJUBF0GlaejyS4T_kI1ISckM9L1.jpg?r=5a4',
          isActive: false
        },
        {
          title: 'Filme 4',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABePagAWDoKes6YLxCcSSM0R6vt8dfhV3nffNPQRAW_jYzcSIqtnQd_cM18DW2SyM75e93yqE9MQNuIsEB-4WTRFbQkPFgtZvC1bBCP3Fgbb6Est1iH9flsD-gPq-N8WVYyGt.jpg?r=34d',
          isActive: false
        },
        {
          title: 'Filme 5',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABblT6s8BUXwRhIjbqvRESyanX07GPOUE-bl5_56vNIglPG2V-uJYaQCibUe01AEY8ts-uzpd8bMDz2oyrvtKprSdr0oLY9ZcYBs.webp?r=49b',
          isActive: false
        },
        {
          title: 'Filme 6',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABZzL8uuT1VlwqhGT8_RFDtrYSyqPsA7owHDLMcJTOYU_RfQLG5wbyG4gjcAM7Rkvp0Mazr_nmy2E99PoCAb8rRchNQNtL_lcbd-ayZR0eIlskFJZEDmAs_-okC-RFXH4NzPO.jpg?r=1fc',
          isActive: false
        },
        {
          title: 'Filme 7',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABaCwUvdmr9GKgMlgbxP55w3BusPzBI36fx3YoMZ-n1YLXxJfsIy00hYSaRDLukmaZkrdUk6HVBh95Q5l1mxdRFroRuLTQ50azIs.webp?r=a22',
          isActive: false
        },
        {
          title: 'Filme 8',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABRIuLz341A7wnjm42XbOPThiyKKWL2nln6FILcJuvwIuDoDM9O7oxi8DXV5S_2C_-kMHoG0fzZ8H0RGXKCnGI32elV9k8dJK9r94Ebkx0x3jsXcCVuSIWSanqOmWYKum1Aqm.jpg?r=cb6',
          isActive: false
        },
        {
          title: 'Filme 9',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABViRdVfryoqQIfgtu2_AfjhWweZcQXc2CGYIucUq6_UyH7gs22Y4Voe_oaZo6_dbgIH8y8vFhyqd1fGa7C8tGP0pycpcK5qem1sY2dP-jPCvisD6b6aC7VslGEqL_G_2toYu.jpg?r=c90',
          isActive: false
        },
        {
          title: 'Filme 10',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABRkRSJrXwvHbU2fDYKJfR7lwSl623-656ws8A9Bs170WQNeQqz4pBvBsyMt-TY9O_mvkH4jA4FZaAmhd3oUFq0AhXSu_cZLGQYMXU5VpANfCP8IPmly6eeO6RMhepevIG1Zr.jpg?r=019',
          isActive: false
        },
        {
          title: 'Filme 11',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABaKXrcLh57Clj2ery1iCf8Tu_xXZs_ULDduzaC1uXDDy_0Xkp1XZ8jt2xyIKOTh1-gFZqASQmPVTGhNPYPqJlgbNjqM8MLXFmshD_9D1Gyefgs1NYwDsQeFvGEJ-L9gLDOjS.jpg?r=2d4',
          isActive: false
        },
        {
          title: 'Filme 12',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABZyVdru72h9ZlXBDo5gTNBgsIeEr-dPs5ZSjXue14XeNmqDPoi6L5zARKBqqktmGerQaU8QanDdNaegCCgViRAdkDf2Ng0MZZkkHTOpVa4ThF0blIEb00NxVVvG99Dy161-e.jpg?r=3ab',
          isActive: false
        }
      ],
      itemsQuatro: [
        {
          title: 'Filme 1',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABYG24J44t6AaQ48kW8CiqH2nK6fJq_Irr9c1kPHZLwv6EGCiXu9qvlvLocwVm2Do-IpYbws8B9v96_geaPpNuG-6jkA_goi1GpeyTudVKAGm2ooO2BRV4isuneS0a0WS0ONv.jpg?r=bab',
          isActive: false
        },
        {
          title: 'Filme 2',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABe9BgpK_kSp-xnN0W49mHBaKgEACCK4JtJrSywpgh3eMH_d7hsWMOf4ejmbKQ-xUi4QdijxNjG9COGllZYgWBwILSEkOea7c1Gq9pDgKouDSV2vExdjQiizruw5uLy4Mnlm0.jpg?r=69f',
          isActive: false
        },
        {
          title: 'Filme 3',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABWJ3H2jFQ_GvBsdYXHzg6LcK1kEK1cdBIH3Stf6OgQUIrOf0jy4JUNuWdhDvsopmGbOZtPHowOpVF1kJGPtUl-8wXWntIBKzhMEgTQZxVjelBLUWEGrVIOmK-0UIIoKBlr2q.jpg?r=299',
          isActive: false
        },
        {
          title: 'Filme 4',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABZRZIg6BnarsEpc7NUPhUfdL0Kq5D-xnpaxgLZ7yQoCkZPq7vGqbaC9rLGkywZHORC10vU0V2L14Wq-Bt2Lrut8SWFA237Wujwu51XusH-CFWuBjnBuO6NPyDBZkZNSQVnoG.jpg?r=710',
          isActive: false
        },
        {
          title: 'Filme 5',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABfSYFPbNWM7Id0p33qdsCQYPnqEyqyzU1uPNgbWGfNlAebmPh_lD46moEY575fM_acIsA2ygqbap9NNkmWp0dokhE-WHzwYHsjwka4KqFbICRxXVwdqzFJNhmMwdzRSUc4R_.jpg?r=799',
          isActive: false
        },
        {
          title: 'Filme 6',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABQG7zwmg-DmoD5dKt3OGz2nVsOshPkm-8AQPn5k3vJWYH_a7plHYxWyzPuOt8G8LIBmA45HSx0R5TS3ZHQKX2BlvqAhR0pWkmxV3-wc2GtpL-mNDZQ9P8l4FBsQlwT4bwzzK.jpg?r=3a6',
          isActive: false
        },
        {
          title: 'Filme 7',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABc9JkyIXQZTlQ4uZWlJoylDsD2pvJ8kn3nHlcCOhW1EDmERpSnsIImm620VIcb5b7MeCr254fTdp0awmxDsK-XiftZmoKtuPfIyJkl1hE-fw_HEg4f6vJn45z7MGQZWmBofA.jpg?r=6f4',
          isActive: false
        },
        {
          title: 'Filme 8',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABfQZkk0BOVaSaIEJvl46nzPSwu1CQHYSwhW8kLAk4e-mni1mZK00dWo44DhVNbqul4UaF5uBe2a0RufDH1j0pDoxStb8eDBS5hao4wkl9vZDuqvIzaZX4gfAdMzTVWE4DIww.jpg?r=6f2',
          isActive: false
        },
        {
          title: 'Filme 9',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABeY3VeUwaXQ_2J-6ajWrCAKXKUh126Cq5CVh4pAm2Jez4yhxlbPa5GdNsLww8V01JlXVwWGcQ_33tz0D92DIeRGv5Ihc7AWDwusZsFXZYlXQQPeOEGry0SwcZF91EdJFV-_7.jpg?r=364',
          isActive: false
        },
        {
          title: 'Filme 10',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABeW9sL_OW9co5zChh_Qi4jGR0R0K9S7Y_Y9nJmyezv2LuLZzDhtit5C3M-vXFSIvve0yde1AiVkAs7qFGcGQjgoHErxRXWVFpagYp7aSDVDmIT8aOiVsvSFpWYm3gLWeayFS.jpg?r=b2d',
          isActive: false
        },
        {
          title: 'Filme 11',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABW4cesbspEAhJB-oC0BXXqyfTbqoEkOW9l_Bizh2CqK-wjYoAt7sOWH8dXVit-WYpfL4mPXJMnjaN8S-CZ_-XlG69KU8Dm_wUV74ietu2gH5hEPs2rp_eNUSjnbrLtCL9MVp.jpg?r=57e',
          isActive: false
        },
        {
          title: 'Filme 12',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABSt60hEmtd6U1jv-BqyAQjDMXlMJ-JW6wN9vDzLNwnygVQF2eRfRdO8go6SZ1dmll1ef3PUbXfb6a_SpTsWtl5Ak3Dv1zQy2mRJhLklFiVoybEKmQ2x2KhqQzDwLMf9196lY.jpg?r=dab',
          isActive: false
        }
      ],
      itemsCinco: [
        {
          title: 'Filme 1',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABQOQdHb1z1amHfzBqcqHovwDPP5yd-BPv0OAlYPsYRR3_W-9570JDiUJ2u2VYTjxPLFEkqZZaaZ4U1AzZb2m6SyjQNjNhuR2ctStvCIcxtWkSPnsGpG-biBFP5ME9AKFmz1f.jpg?r=2ee',
          isActive: false
        },
        {
          title: 'Filme 2',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABSPBTTvSQTgUxcK3gQHISlGkb15Vee5xsZNc1dvlCbZqw4pzuVtErW-Ot-BpEkxz1k0tqW2UOynJ01XXmC9NTjibIdhj3HTMRVIXp2AYRSKnu-n0KNhqWdzxFJiMEUNItAQw.jpg?r=cfc',
          isActive: false
        },
        {
          title: 'Filme 3',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABQo2GIROX3jMTFFnRJWZBFxvs45-5z1sK8kai8zwP55lIDt6HA59-pND0lFqo3JRl68OCAiLv0SSxvnb0Hs58_Quuy3E--hjeO4tqXFy8jXg0Nk9ZIKREEzmgL6rKYH_ySUG.jpg?r=a0d',
          isActive: false
        },
        {
          title: 'Filme 4',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABceFw70tYGyh6ymgzjKt0k4Wixu_1BnKgQs_QkR54q1tSNU63f8ck7n-PjHAkR3JRDqqWgItHJBysEo6ElzAdfgXMr_ngZJ_u9CQ3k_8m0Emk7yXqPgzTt612Pk7pz_AdRrp.jpg?r=970',
          isActive: false
        },
        {
          title: 'Filme 5',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABTw-IchmBhH_bCXVZIQYwI19nnd0NQBDxJFQmTokzIUwS6d52SgxrRHD-nT92qjDvCzRxinykvfNeV_oJ4ttAo4rB5df1SAG65L3jhCbMn0lt4iFD7gZ-T-Hncx159z0Lu9y.jpg?r=48d',
          isActive: false
        },
        {
          title: 'Filme 6',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABc1BF_I30cgLlYCZjBww2yPpuNDQq_Mk6X6ZWq8hqfoVJCeMeadk4HSstiXrtYuowZioXxr4tF-UJVVOEFCvNibMgrG5CqHJAb4T_E4UAkuXNsKXR_wQrzhiQWv0a_UqO0oR.jpg?r=0d9',
          isActive: false
        },
        {
          title: 'Filme 7',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABQ4FQimqxMmXEFJCd1KMCvEzz2T_OFxJv3risteSV2rJ-4hAdFx1FiS3o0OPvAXHQ1t3wpkg2pq9j661VFOm5DRrSdFMXWKfd88.webp?r=25d',
          isActive: false
        },
        {
          title: 'Filme 7',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABfIInOkQa5upa3v8dacoke24a5S80Ql_ly6mCUkyA39ymj6k3jaSQ2Lihx9l7-8CzzP428oX8cACM8_sY2AK2x0Cmn6y5wczNQy_q8xOOmvnsNgzkZ-BAas-7SdrP6rHtwd4.jpg?r=21a',
          isActive: false
        },
        {
          title: 'Filme 8',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABe9BgpK_kSp-xnN0W49mHBaKgEACCK4JtJrSywpgh3eMH_d7hsWMOf4ejmbKQ-xUi4QdijxNjG9COGllZYgWBwILSEkOea7c1Gq9pDgKouDSV2vExdjQiizruw5uLy4Mnlm0.jpg?r=69f',
          isActive: false
        },
        {
          title: 'Filme 9',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABXgkuUJ2i4Uw4EwbaxP0OBnyx8kpDaulylqzEr7FA2aKrHy_2JsewKC0iJya-xI5JKS-k8cGw54Qh7vkzCdhdAX-MrLba0UBCtI_CEv3e-dEDqtXYNg5qM43TZFVbOaGCe3P.jpg?r=9c1',
          isActive: false
        },
        {
          title: 'Filme 10',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABc6Z2JqfUaOJ9UNXXMADBiLLaHWtB5wArrG9aMAxfgr9Qeou_lzhD5YCeI46IqiaRmqV7VhtnwZ4O8LCZTW9VOWDgjFFR0wYrEEofyUgo86TrQycZdtkCMtznmqUgc9echwQ.jpg?r=817',
          isActive: false
        },
        {
          title: 'Filme 11',
          image: 'https://occ-0-5446-1380.1.nflxso.net/dnm/api/v6/6gmvu2hxdfnQ55LZZjyzYR4kzGk/AAAABW4cesbspEAhJB-oC0BXXqyfTbqoEkOW9l_Bizh2CqK-wjYoAt7sOWH8dXVit-WYpfL4mPXJMnjaN8S-CZ_-XlG69KU8Dm_wUV74ietu2gH5hEPs2rp_eNUSjnbrLtCL9MVp.jpg?r=57e',
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
  url("../../assets/imagemPrincipal.jpg");
  background-repeat: no-repeat;
  background-size: cover;
  height: 100%;
  width: 100%;
}
</style>
