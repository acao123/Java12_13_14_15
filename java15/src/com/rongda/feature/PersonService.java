package com.rongda.feature;

/**
 * @class: PersonService.class
 * @description:
 * @author: acao
 * @create: 2020-11-23 20:21
 **/
public sealed interface PersonService permits PersonServiceImpl {

}

final class PersonServiceImpl implements PersonService {

}
