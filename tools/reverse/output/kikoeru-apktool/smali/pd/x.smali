.class public final Lpd/x;
.super Ljava/lang/Object;

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final b:Lpd/z;


# direct methods
.method public synthetic constructor <init>(Lpd/z;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpd/x;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lpd/x;->b:Lpd/z;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lpd/x;->a:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const-string v4, "name"

    .line 8
    .line 9
    iget-object v5, v0, Lpd/x;->b:Lpd/z;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Lbe/e;

    .line 17
    .line 18
    invoke-static {v1, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v3, v5, Lpd/z;->g:Lre/j;

    .line 27
    .line 28
    invoke-virtual {v3, v1}, Lre/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v2, v3}, Lbf/m;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5, v1, v2}, Lpd/z;->n(Lbe/e;Ljava/util/ArrayList;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5}, Lpd/z;->q()Lyc/k;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget v3, Lee/e;->a:I

    .line 43
    .line 44
    sget-object v3, Lyc/f;->e:Lyc/f;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lee/e;->m(Lyc/k;Lyc/f;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    invoke-static {v2}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object v1, v5, Lpd/z;->b:Lb0/w1;

    .line 58
    .line 59
    iget-object v3, v1, Lb0/w1;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lod/a;

    .line 62
    .line 63
    iget-object v3, v3, Lod/a;->r:Ltd/c;

    .line 64
    .line 65
    invoke-virtual {v3, v1, v2}, Ltd/c;->e(Lb0/w1;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v1}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :goto_0
    return-object v1

    .line 74
    :pswitch_0
    move-object/from16 v1, p1

    .line 75
    .line 76
    check-cast v1, Lbe/e;

    .line 77
    .line 78
    invoke-static {v1, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 82
    .line 83
    iget-object v6, v5, Lpd/z;->f:Lre/e;

    .line 84
    .line 85
    invoke-virtual {v6, v1}, Lre/e;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    check-cast v6, Ljava/util/Collection;

    .line 90
    .line 91
    invoke-direct {v4, v6}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 92
    .line 93
    .line 94
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 95
    .line 96
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_2

    .line 108
    .line 109
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    move-object v9, v8

    .line 114
    check-cast v9, Lbd/s0;

    .line 115
    .line 116
    invoke-static {v9, v2}, Lua/l;->J(Lyc/t;I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    if-nez v10, :cond_1

    .line 125
    .line 126
    new-instance v10, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {v6, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    :cond_1
    check-cast v10, Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v10, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_4

    .line 153
    .line 154
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    check-cast v6, Ljava/util/List;

    .line 159
    .line 160
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-eq v7, v3, :cond_3

    .line 165
    .line 166
    check-cast v6, Ljava/util/Collection;

    .line 167
    .line 168
    sget-object v7, Lpd/l;->c:Lpd/l;

    .line 169
    .line 170
    invoke-static {v6, v7}, Lee/m;->o(Ljava/util/Collection;Lic/k;)Ljava/util/Collection;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-interface {v4, v6}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 175
    .line 176
    .line 177
    invoke-interface {v4, v7}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_4
    invoke-virtual {v5, v4, v1}, Lpd/z;->m(Ljava/util/LinkedHashSet;Lbe/e;)V

    .line 182
    .line 183
    .line 184
    iget-object v1, v5, Lpd/z;->b:Lb0/w1;

    .line 185
    .line 186
    iget-object v2, v1, Lb0/w1;->c:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v2, Lod/a;

    .line 189
    .line 190
    iget-object v2, v2, Lod/a;->r:Ltd/c;

    .line 191
    .line 192
    invoke-virtual {v2, v1, v4}, Ltd/c;->e(Lb0/w1;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-static {v1}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, Ljava/util/Collection;

    .line 201
    .line 202
    return-object v1

    .line 203
    :pswitch_1
    move-object/from16 v1, p1

    .line 204
    .line 205
    check-cast v1, Lbe/e;

    .line 206
    .line 207
    invoke-static {v1, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    iget-object v4, v5, Lpd/z;->c:Lpd/z;

    .line 211
    .line 212
    if-eqz v4, :cond_5

    .line 213
    .line 214
    iget-object v2, v4, Lpd/z;->g:Lre/j;

    .line 215
    .line 216
    invoke-virtual {v2, v1}, Lre/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    check-cast v1, Lyc/k0;

    .line 221
    .line 222
    goto/16 :goto_d

    .line 223
    .line 224
    :cond_5
    iget-object v4, v5, Lpd/z;->e:Lre/i;

    .line 225
    .line 226
    invoke-virtual {v4}, Lre/i;->b()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, Lpd/c;

    .line 231
    .line 232
    invoke-interface {v4, v1}, Lpd/c;->b(Lbe/e;)Led/u;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    const/4 v4, 0x0

    .line 237
    if-eqz v1, :cond_16

    .line 238
    .line 239
    iget-object v6, v1, Led/u;->a:Ljava/lang/reflect/Field;

    .line 240
    .line 241
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    if-nez v7, :cond_16

    .line 246
    .line 247
    new-instance v7, Ljc/y;

    .line 248
    .line 249
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, Led/u;->b()Ljava/lang/reflect/Member;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    check-cast v8, Ljava/lang/reflect/Field;

    .line 257
    .line 258
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    xor-int/lit8 v12, v8, 0x1

    .line 267
    .line 268
    iget-object v8, v5, Lpd/z;->b:Lb0/w1;

    .line 269
    .line 270
    invoke-static {v8, v1}, Ln7/e;->z(Lb0/w1;Lsd/b;)Lod/c;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    iget-object v9, v8, Lb0/w1;->c:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v9, Lod/a;

    .line 277
    .line 278
    invoke-virtual {v5}, Lpd/z;->q()Lyc/k;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    invoke-virtual {v1}, Led/w;->e()Lyc/e1;

    .line 283
    .line 284
    .line 285
    move-result-object v13

    .line 286
    invoke-static {v13}, Lgh/g;->Q(Lyc/e1;)Lld/o;

    .line 287
    .line 288
    .line 289
    move-result-object v13

    .line 290
    move-object v14, v11

    .line 291
    move-object v11, v13

    .line 292
    invoke-virtual {v1}, Led/w;->c()Lbe/e;

    .line 293
    .line 294
    .line 295
    move-result-object v13

    .line 296
    iget-object v15, v9, Lod/a;->j:Ldd/e;

    .line 297
    .line 298
    invoke-virtual {v15, v1}, Ldd/e;->c(Lsd/c;)Ldd/g;

    .line 299
    .line 300
    .line 301
    move-result-object v15

    .line 302
    invoke-virtual {v1}, Led/u;->b()Ljava/lang/reflect/Member;

    .line 303
    .line 304
    .line 305
    move-result-object v16

    .line 306
    check-cast v16, Ljava/lang/reflect/Field;

    .line 307
    .line 308
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 309
    .line 310
    .line 311
    move-result v16

    .line 312
    invoke-static/range {v16 .. v16}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 313
    .line 314
    .line 315
    move-result v16

    .line 316
    const/16 v17, 0x2

    .line 317
    .line 318
    const/4 v2, 0x0

    .line 319
    if-eqz v16, :cond_6

    .line 320
    .line 321
    invoke-virtual {v1}, Led/u;->b()Ljava/lang/reflect/Member;

    .line 322
    .line 323
    .line 324
    move-result-object v16

    .line 325
    check-cast v16, Ljava/lang/reflect/Field;

    .line 326
    .line 327
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 328
    .line 329
    .line 330
    move-result v16

    .line 331
    invoke-static/range {v16 .. v16}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 332
    .line 333
    .line 334
    move-result v16

    .line 335
    if-eqz v16, :cond_6

    .line 336
    .line 337
    move-object v3, v9

    .line 338
    move-object v9, v14

    .line 339
    move-object v14, v15

    .line 340
    const/4 v15, 0x1

    .line 341
    :goto_3
    const/16 v16, 0x1

    .line 342
    .line 343
    goto :goto_4

    .line 344
    :cond_6
    move-object v3, v9

    .line 345
    move-object v9, v14

    .line 346
    move-object v14, v15

    .line 347
    const/4 v15, 0x0

    .line 348
    goto :goto_3

    .line 349
    :goto_4
    invoke-static/range {v9 .. v15}, Lnd/f;->L1(Lyc/k;Lod/c;Lld/o;ZLbe/e;Ldd/g;Z)Lnd/f;

    .line 350
    .line 351
    .line 352
    move-result-object v9

    .line 353
    iput-object v9, v7, Ljc/y;->a:Ljava/lang/Object;

    .line 354
    .line 355
    invoke-virtual {v9, v4, v4, v4, v4}, Lbd/p0;->H1(Lbd/q0;Lbd/r0;Lbd/w;Lbd/w;)V

    .line 356
    .line 357
    .line 358
    iget-object v9, v8, Lb0/w1;->e:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v9, Lc7/e1;

    .line 361
    .line 362
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 363
    .line 364
    .line 365
    move-result-object v6

    .line 366
    const-string v10, "getGenericType(...)"

    .line 367
    .line 368
    invoke-static {v6, v10}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    instance-of v10, v6, Ljava/lang/Class;

    .line 372
    .line 373
    if-eqz v10, :cond_7

    .line 374
    .line 375
    move-object v11, v6

    .line 376
    check-cast v11, Ljava/lang/Class;

    .line 377
    .line 378
    invoke-virtual {v11}, Ljava/lang/Class;->isPrimitive()Z

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    if-eqz v12, :cond_7

    .line 383
    .line 384
    new-instance v6, Led/z;

    .line 385
    .line 386
    invoke-direct {v6, v11}, Led/z;-><init>(Ljava/lang/Class;)V

    .line 387
    .line 388
    .line 389
    goto :goto_7

    .line 390
    :cond_7
    instance-of v11, v6, Ljava/lang/reflect/GenericArrayType;

    .line 391
    .line 392
    if-nez v11, :cond_a

    .line 393
    .line 394
    if-eqz v10, :cond_8

    .line 395
    .line 396
    move-object v10, v6

    .line 397
    check-cast v10, Ljava/lang/Class;

    .line 398
    .line 399
    invoke-virtual {v10}, Ljava/lang/Class;->isArray()Z

    .line 400
    .line 401
    .line 402
    move-result v10

    .line 403
    if-eqz v10, :cond_8

    .line 404
    .line 405
    goto :goto_6

    .line 406
    :cond_8
    instance-of v10, v6, Ljava/lang/reflect/WildcardType;

    .line 407
    .line 408
    if-eqz v10, :cond_9

    .line 409
    .line 410
    new-instance v10, Led/e0;

    .line 411
    .line 412
    check-cast v6, Ljava/lang/reflect/WildcardType;

    .line 413
    .line 414
    invoke-direct {v10, v6}, Led/e0;-><init>(Ljava/lang/reflect/WildcardType;)V

    .line 415
    .line 416
    .line 417
    :goto_5
    move-object v6, v10

    .line 418
    goto :goto_7

    .line 419
    :cond_9
    new-instance v10, Led/q;

    .line 420
    .line 421
    invoke-direct {v10, v6}, Led/q;-><init>(Ljava/lang/reflect/Type;)V

    .line 422
    .line 423
    .line 424
    goto :goto_5

    .line 425
    :cond_a
    :goto_6
    new-instance v10, Led/i;

    .line 426
    .line 427
    invoke-direct {v10, v6}, Led/i;-><init>(Ljava/lang/reflect/Type;)V

    .line 428
    .line 429
    .line 430
    goto :goto_5

    .line 431
    :goto_7
    sget-object v10, Lse/s0;->b:Lse/s0;

    .line 432
    .line 433
    const/4 v11, 0x7

    .line 434
    invoke-static {v10, v2, v4, v11}, Ln7/e;->F(Lse/s0;ZLpd/e0;I)Lqd/a;

    .line 435
    .line 436
    .line 437
    move-result-object v10

    .line 438
    invoke-virtual {v9, v6, v10}, Lc7/e1;->h0(Lsd/d;Lqd/a;)Lse/w;

    .line 439
    .line 440
    .line 441
    move-result-object v19

    .line 442
    invoke-static/range {v19 .. v19}, Lvc/i;->F(Lse/w;)Z

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    if-nez v6, :cond_b

    .line 447
    .line 448
    invoke-static/range {v19 .. v19}, Lvc/i;->G(Lse/w;)Z

    .line 449
    .line 450
    .line 451
    move-result v6

    .line 452
    if-eqz v6, :cond_c

    .line 453
    .line 454
    :cond_b
    invoke-virtual {v1}, Led/u;->b()Ljava/lang/reflect/Member;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    check-cast v6, Ljava/lang/reflect/Field;

    .line 459
    .line 460
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 461
    .line 462
    .line 463
    move-result v6

    .line 464
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 465
    .line 466
    .line 467
    move-result v6

    .line 468
    if-eqz v6, :cond_c

    .line 469
    .line 470
    invoke-virtual {v1}, Led/u;->b()Ljava/lang/reflect/Member;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    check-cast v6, Ljava/lang/reflect/Field;

    .line 475
    .line 476
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 477
    .line 478
    .line 479
    move-result v6

    .line 480
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 481
    .line 482
    .line 483
    move-result v6

    .line 484
    :cond_c
    iget-object v6, v7, Ljc/y;->a:Ljava/lang/Object;

    .line 485
    .line 486
    move-object/from16 v18, v6

    .line 487
    .line 488
    check-cast v18, Lbd/p0;

    .line 489
    .line 490
    invoke-virtual {v5}, Lpd/z;->p()Lbd/a0;

    .line 491
    .line 492
    .line 493
    move-result-object v21

    .line 494
    const/16 v22, 0x0

    .line 495
    .line 496
    sget-object v20, Lvb/r;->a:Lvb/r;

    .line 497
    .line 498
    move-object/from16 v23, v20

    .line 499
    .line 500
    invoke-virtual/range {v18 .. v23}, Lbd/p0;->K1(Lse/w;Ljava/util/List;Lbd/a0;Lbd/a0;Ljava/util/List;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v5}, Lpd/z;->q()Lyc/k;

    .line 504
    .line 505
    .line 506
    move-result-object v6

    .line 507
    instance-of v9, v6, Lyc/e;

    .line 508
    .line 509
    if-eqz v9, :cond_d

    .line 510
    .line 511
    check-cast v6, Lyc/e;

    .line 512
    .line 513
    goto :goto_8

    .line 514
    :cond_d
    move-object v6, v4

    .line 515
    :goto_8
    if-eqz v6, :cond_e

    .line 516
    .line 517
    iget-object v9, v3, Lod/a;->x:Lje/e;

    .line 518
    .line 519
    iget-object v10, v7, Ljc/y;->a:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v10, Lbd/p0;

    .line 522
    .line 523
    check-cast v9, Lje/a;

    .line 524
    .line 525
    invoke-virtual {v9, v6, v10, v8}, Lje/a;->h(Lyc/e;Lbd/p0;Lb0/w1;)Lbd/p0;

    .line 526
    .line 527
    .line 528
    move-result-object v6

    .line 529
    iput-object v6, v7, Ljc/y;->a:Ljava/lang/Object;

    .line 530
    .line 531
    :cond_e
    iget-object v6, v7, Ljc/y;->a:Ljava/lang/Object;

    .line 532
    .line 533
    move-object v8, v6

    .line 534
    check-cast v8, Lyc/t0;

    .line 535
    .line 536
    check-cast v6, Lbd/p0;

    .line 537
    .line 538
    invoke-virtual {v6}, Lbd/z0;->b()Lse/w;

    .line 539
    .line 540
    .line 541
    move-result-object v6

    .line 542
    if-eqz v8, :cond_15

    .line 543
    .line 544
    if-eqz v6, :cond_14

    .line 545
    .line 546
    sget v9, Lee/e;->a:I

    .line 547
    .line 548
    invoke-interface {v8}, Lyc/t0;->u0()Z

    .line 549
    .line 550
    .line 551
    move-result v9

    .line 552
    if-nez v9, :cond_12

    .line 553
    .line 554
    invoke-static {v6}, Lse/c;->l(Lse/w;)Z

    .line 555
    .line 556
    .line 557
    move-result v9

    .line 558
    if-eqz v9, :cond_f

    .line 559
    .line 560
    goto :goto_a

    .line 561
    :cond_f
    invoke-static {v6}, Lse/u0;->b(Lse/w;)Z

    .line 562
    .line 563
    .line 564
    move-result v9

    .line 565
    if-eqz v9, :cond_10

    .line 566
    .line 567
    goto :goto_9

    .line 568
    :cond_10
    invoke-static {v8}, Lie/d;->e(Lyc/k;)Lvc/i;

    .line 569
    .line 570
    .line 571
    move-result-object v8

    .line 572
    invoke-static {v6}, Lvc/i;->F(Lse/w;)Z

    .line 573
    .line 574
    .line 575
    move-result v9

    .line 576
    if-nez v9, :cond_11

    .line 577
    .line 578
    sget-object v9, Lte/d;->a:Lte/l;

    .line 579
    .line 580
    invoke-virtual {v8}, Lvc/i;->u()Lse/a0;

    .line 581
    .line 582
    .line 583
    move-result-object v10

    .line 584
    invoke-virtual {v9, v10, v6}, Lte/l;->a(Lse/w;Lse/w;)Z

    .line 585
    .line 586
    .line 587
    move-result v10

    .line 588
    if-nez v10, :cond_11

    .line 589
    .line 590
    const-string v10, "Number"

    .line 591
    .line 592
    invoke-virtual {v8, v10}, Lvc/i;->k(Ljava/lang/String;)Lyc/e;

    .line 593
    .line 594
    .line 595
    move-result-object v10

    .line 596
    invoke-interface {v10}, Lyc/e;->E()Lse/a0;

    .line 597
    .line 598
    .line 599
    move-result-object v10

    .line 600
    invoke-virtual {v9, v10, v6}, Lte/l;->a(Lse/w;Lse/w;)Z

    .line 601
    .line 602
    .line 603
    move-result v10

    .line 604
    if-nez v10, :cond_11

    .line 605
    .line 606
    invoke-virtual {v8}, Lvc/i;->e()Lse/a0;

    .line 607
    .line 608
    .line 609
    move-result-object v8

    .line 610
    invoke-virtual {v9, v8, v6}, Lte/l;->a(Lse/w;Lse/w;)Z

    .line 611
    .line 612
    .line 613
    move-result v8

    .line 614
    if-nez v8, :cond_11

    .line 615
    .line 616
    invoke-static {v6}, Lvc/s;->a(Lse/w;)Z

    .line 617
    .line 618
    .line 619
    move-result v6

    .line 620
    if-eqz v6, :cond_12

    .line 621
    .line 622
    :cond_11
    :goto_9
    iget-object v6, v7, Ljc/y;->a:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v6, Lbd/p0;

    .line 625
    .line 626
    new-instance v8, Lpd/w;

    .line 627
    .line 628
    invoke-direct {v8, v5, v1, v7, v2}, Lpd/w;-><init>(Lpd/z;Led/u;Ljc/y;I)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v6, v4, v8}, Lbd/p0;->I1(Lre/h;Lic/a;)V

    .line 632
    .line 633
    .line 634
    :cond_12
    :goto_a
    iget-object v1, v3, Lod/a;->g:Lmd/h;

    .line 635
    .line 636
    iget-object v3, v7, Ljc/y;->a:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v3, Lyc/k0;

    .line 639
    .line 640
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 641
    .line 642
    .line 643
    if-eqz v3, :cond_13

    .line 644
    .line 645
    iget-object v1, v7, Ljc/y;->a:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v1, Lyc/k0;

    .line 648
    .line 649
    goto :goto_d

    .line 650
    :cond_13
    const/4 v1, 0x3

    .line 651
    new-array v1, v1, [Ljava/lang/Object;

    .line 652
    .line 653
    const/4 v3, 0x6

    .line 654
    packed-switch v3, :pswitch_data_1

    .line 655
    .line 656
    .line 657
    const-string v4, "fqName"

    .line 658
    .line 659
    aput-object v4, v1, v2

    .line 660
    .line 661
    goto :goto_b

    .line 662
    :pswitch_2
    const-string v4, "javaClass"

    .line 663
    .line 664
    aput-object v4, v1, v2

    .line 665
    .line 666
    goto :goto_b

    .line 667
    :pswitch_3
    const-string v4, "field"

    .line 668
    .line 669
    aput-object v4, v1, v2

    .line 670
    .line 671
    goto :goto_b

    .line 672
    :pswitch_4
    const-string v4, "element"

    .line 673
    .line 674
    aput-object v4, v1, v2

    .line 675
    .line 676
    goto :goto_b

    .line 677
    :pswitch_5
    const-string v4, "descriptor"

    .line 678
    .line 679
    aput-object v4, v1, v2

    .line 680
    .line 681
    goto :goto_b

    .line 682
    :pswitch_6
    const-string v4, "member"

    .line 683
    .line 684
    aput-object v4, v1, v2

    .line 685
    .line 686
    :goto_b
    const-string v2, "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1"

    .line 687
    .line 688
    aput-object v2, v1, v16

    .line 689
    .line 690
    packed-switch v3, :pswitch_data_2

    .line 691
    .line 692
    .line 693
    const-string v2, "getClassResolvedFromSource"

    .line 694
    .line 695
    aput-object v2, v1, v17

    .line 696
    .line 697
    goto :goto_c

    .line 698
    :pswitch_7
    const-string v2, "recordClass"

    .line 699
    .line 700
    aput-object v2, v1, v17

    .line 701
    .line 702
    goto :goto_c

    .line 703
    :pswitch_8
    const-string v2, "recordField"

    .line 704
    .line 705
    aput-object v2, v1, v17

    .line 706
    .line 707
    goto :goto_c

    .line 708
    :pswitch_9
    const-string v2, "recordConstructor"

    .line 709
    .line 710
    aput-object v2, v1, v17

    .line 711
    .line 712
    goto :goto_c

    .line 713
    :pswitch_a
    const-string v2, "recordMethod"

    .line 714
    .line 715
    aput-object v2, v1, v17

    .line 716
    .line 717
    :goto_c
    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 718
    .line 719
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v1

    .line 723
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 724
    .line 725
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    throw v2

    .line 729
    :cond_14
    const/16 v1, 0x42

    .line 730
    .line 731
    invoke-static {v1}, Lee/e;->a(I)V

    .line 732
    .line 733
    .line 734
    throw v4

    .line 735
    :cond_15
    const/16 v1, 0x41

    .line 736
    .line 737
    invoke-static {v1}, Lee/e;->a(I)V

    .line 738
    .line 739
    .line 740
    throw v4

    .line 741
    :cond_16
    move-object v1, v4

    .line 742
    :goto_d
    return-object v1

    .line 743
    :pswitch_b
    move-object/from16 v1, p1

    .line 744
    .line 745
    check-cast v1, Lbe/e;

    .line 746
    .line 747
    invoke-static {v1, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    iget-object v2, v5, Lpd/z;->c:Lpd/z;

    .line 751
    .line 752
    if-eqz v2, :cond_17

    .line 753
    .line 754
    iget-object v2, v2, Lpd/z;->f:Lre/e;

    .line 755
    .line 756
    invoke-virtual {v2, v1}, Lre/e;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    check-cast v1, Ljava/util/Collection;

    .line 761
    .line 762
    goto :goto_f

    .line 763
    :cond_17
    new-instance v2, Ljava/util/ArrayList;

    .line 764
    .line 765
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 766
    .line 767
    .line 768
    iget-object v3, v5, Lpd/z;->e:Lre/i;

    .line 769
    .line 770
    invoke-virtual {v3}, Lre/i;->b()Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v3

    .line 774
    check-cast v3, Lpd/c;

    .line 775
    .line 776
    invoke-interface {v3, v1}, Lpd/c;->c(Lbe/e;)Ljava/util/Collection;

    .line 777
    .line 778
    .line 779
    move-result-object v3

    .line 780
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    :cond_18
    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 785
    .line 786
    .line 787
    move-result v4

    .line 788
    if-eqz v4, :cond_19

    .line 789
    .line 790
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    check-cast v4, Led/x;

    .line 795
    .line 796
    invoke-virtual {v5, v4}, Lpd/z;->t(Led/x;)Lnd/e;

    .line 797
    .line 798
    .line 799
    move-result-object v4

    .line 800
    invoke-virtual {v5, v4}, Lpd/z;->r(Lnd/e;)Z

    .line 801
    .line 802
    .line 803
    move-result v6

    .line 804
    if-eqz v6, :cond_18

    .line 805
    .line 806
    iget-object v6, v5, Lpd/z;->b:Lb0/w1;

    .line 807
    .line 808
    iget-object v6, v6, Lb0/w1;->c:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast v6, Lod/a;

    .line 811
    .line 812
    iget-object v6, v6, Lod/a;->g:Lmd/h;

    .line 813
    .line 814
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    goto :goto_e

    .line 821
    :cond_19
    invoke-virtual {v5, v1, v2}, Lpd/z;->j(Lbe/e;Ljava/util/ArrayList;)V

    .line 822
    .line 823
    .line 824
    move-object v1, v2

    .line 825
    :goto_f
    return-object v1

    .line 826
    nop

    .line 827
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_5
    .end packed-switch

    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
    .end packed-switch
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method
