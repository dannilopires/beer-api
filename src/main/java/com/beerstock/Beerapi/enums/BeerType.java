package com.beerstock.Beerapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerType {
    LAGER("Lager"), //definiçao ligada ao processo de fabricaçao da bebida,
                        //mais especificamente a etapa de fermentaçao

    MALZBIER("Malzbier"), //É a mais famosa Dark Lager encontrada no Brasil.
                                    // Escura e doce, com teor alcoólico baixo, após a
                                    // sua fermentação é acrescentado xarope de açúcar e caramelo

    WITBIER("Witbier"), // Witbier – a cerveja de trigo prima da alemã. (cerveja belga)
                                    // Da junção das palavras ‘wit’ e ‘bier’, que em neerlandês
                                    // quer dizer branco e cerveja, ou, “cerveja clara”

    WEISS("Weiss"), //Com alta fermentação, as cervejas da família Ale possuem maior corpo,
                             // com gostos e aromas variados. Cerveja de trigo típicas da Bavária, a região mais
                             // ao sul da Alemanha

    ALE("Ale"), // a Lager é a cerveja de baixa fermentação, enquanto a família Ale é composta
                        // pelas cervejas de alta fermentação, entre 15ºC e 24°C, o que faz com que elas tenham maior
                        // complexidade de aromas e sabores.
                        // Geralmente as cervejas Ale possuem também maior corpo e paladar frutado. Os seus sabores
                        // e aromas são os mais variados. Vale lembrar que as cervejas nasceram
                        // no século 19 com alta fermentação, ou seja, naquela época praticamente todas eram da família Ale.

    IPA("Ipa"), // Também conhecidas como India Pale Ale, as IPAs são cervejas mais lupuladas e
                        // consequentemente com mais amargor. Em geral são cervejas muito aromáticas,
                        // refrescantes e com características típicas de cada um de seus subestilos

    STOUT("Stout"); //(Da familia Ale) Estilo de cerveja típico do Reino Unido e da Irlanda.
                                // Apresenta aromas e sabores de torrefação

    private final String description;

}
