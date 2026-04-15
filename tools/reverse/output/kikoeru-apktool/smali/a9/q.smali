.class public final synthetic La9/q;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Le7/a0;


# direct methods
.method public synthetic constructor <init>(Le7/a0;I)V
    .locals 0

    .line 1
    iput p2, p0, La9/q;->a:I

    .line 2
    .line 3
    iput-object p1, p0, La9/q;->b:Le7/a0;

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
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, La9/q;->a:I

    .line 4
    .line 5
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 6
    .line 7
    sget-object v3, Lx0/k;->a:Lx0/r0;

    .line 8
    .line 9
    iget-object v4, v0, La9/q;->b:Le7/a0;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, La0/d;

    .line 19
    .line 20
    move-object/from16 v14, p2

    .line 21
    .line 22
    check-cast v14, Lx0/o;

    .line 23
    .line 24
    move-object/from16 v7, p3

    .line 25
    .line 26
    check-cast v7, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    const-string v8, "$this$item"

    .line 33
    .line 34
    invoke-static {v1, v8}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    and-int/lit8 v1, v7, 0x11

    .line 38
    .line 39
    const/16 v8, 0x10

    .line 40
    .line 41
    if-eq v1, v8, :cond_0

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v1, 0x0

    .line 46
    :goto_0
    and-int/2addr v5, v7

    .line 47
    invoke-virtual {v14, v5, v1}, Lx0/o;->N(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_6

    .line 52
    .line 53
    invoke-virtual {v14}, Lx0/o;->K()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-ne v1, v3, :cond_1

    .line 58
    .line 59
    invoke-static {v14}, Lx0/v;->m(Lx0/o;)Lhf/y;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v14, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    check-cast v1, Lhf/y;

    .line 67
    .line 68
    invoke-virtual {v14}, Lx0/o;->K()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    if-ne v5, v3, :cond_2

    .line 73
    .line 74
    const/4 v5, 0x0

    .line 75
    invoke-static {v5}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v14, v5}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    check-cast v5, Lx0/w0;

    .line 83
    .line 84
    sget-object v7, Lnh/b;->k:Lw1/f;

    .line 85
    .line 86
    if-eqz v7, :cond_3

    .line 87
    .line 88
    goto/16 :goto_1

    .line 89
    .line 90
    :cond_3
    new-instance v15, Lw1/e;

    .line 91
    .line 92
    const/16 v23, 0x0

    .line 93
    .line 94
    const/16 v25, 0x60

    .line 95
    .line 96
    const-string v16, "Filled.Shuffle"

    .line 97
    .line 98
    const/high16 v17, 0x41c00000    # 24.0f

    .line 99
    .line 100
    const/high16 v18, 0x41c00000    # 24.0f

    .line 101
    .line 102
    const/high16 v19, 0x41c00000    # 24.0f

    .line 103
    .line 104
    const/high16 v20, 0x41c00000    # 24.0f

    .line 105
    .line 106
    const-wide/16 v21, 0x0

    .line 107
    .line 108
    const/16 v24, 0x0

    .line 109
    .line 110
    invoke-direct/range {v15 .. v25}, Lw1/e;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 111
    .line 112
    .line 113
    sget v7, Lw1/g0;->a:I

    .line 114
    .line 115
    new-instance v7, Lq1/n0;

    .line 116
    .line 117
    sget-wide v8, Lq1/q;->b:J

    .line 118
    .line 119
    invoke-direct {v7, v8, v9}, Lq1/n0;-><init>(J)V

    .line 120
    .line 121
    .line 122
    new-instance v8, Lhd/q0;

    .line 123
    .line 124
    const/4 v9, 0x6

    .line 125
    invoke-direct {v8, v6, v9}, Lhd/q0;-><init>(BI)V

    .line 126
    .line 127
    .line 128
    const v9, 0x412970a4    # 10.59f

    .line 129
    .line 130
    .line 131
    const v10, 0x4112b852    # 9.17f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v8, v9, v10}, Lhd/q0;->u(FF)V

    .line 135
    .line 136
    .line 137
    const v9, 0x40ad1eb8    # 5.41f

    .line 138
    .line 139
    .line 140
    const/high16 v10, 0x40800000    # 4.0f

    .line 141
    .line 142
    invoke-virtual {v8, v9, v10}, Lhd/q0;->s(FF)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8, v10, v9}, Lhd/q0;->s(FF)V

    .line 146
    .line 147
    .line 148
    const v11, 0x40a570a4    # 5.17f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v8, v11, v11}, Lhd/q0;->t(FF)V

    .line 152
    .line 153
    .line 154
    const v11, 0x3fb5c28f    # 1.42f

    .line 155
    .line 156
    .line 157
    const v12, -0x404b851f    # -1.41f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v8, v11, v12}, Lhd/q0;->t(FF)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v8}, Lhd/q0;->l()V

    .line 164
    .line 165
    .line 166
    const/high16 v11, 0x41680000    # 14.5f

    .line 167
    .line 168
    invoke-virtual {v8, v11, v10}, Lhd/q0;->u(FF)V

    .line 169
    .line 170
    .line 171
    const v13, 0x40028f5c    # 2.04f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v8, v13, v13}, Lhd/q0;->t(FF)V

    .line 175
    .line 176
    .line 177
    const v6, 0x4194b852    # 18.59f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v8, v10, v6}, Lhd/q0;->s(FF)V

    .line 181
    .line 182
    .line 183
    const/high16 v6, 0x41a00000    # 20.0f

    .line 184
    .line 185
    invoke-virtual {v8, v9, v6}, Lhd/q0;->s(FF)V

    .line 186
    .line 187
    .line 188
    const v9, 0x418fae14    # 17.96f

    .line 189
    .line 190
    .line 191
    const v13, 0x40eeb852    # 7.46f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v8, v9, v13}, Lhd/q0;->s(FF)V

    .line 195
    .line 196
    .line 197
    const/high16 v9, 0x41180000    # 9.5f

    .line 198
    .line 199
    invoke-virtual {v8, v6, v9}, Lhd/q0;->s(FF)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v8, v6, v10}, Lhd/q0;->s(FF)V

    .line 203
    .line 204
    .line 205
    const/high16 v9, -0x3f500000    # -5.5f

    .line 206
    .line 207
    invoke-virtual {v8, v9}, Lhd/q0;->r(F)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v8}, Lhd/q0;->l()V

    .line 211
    .line 212
    .line 213
    const v10, 0x416d47ae    # 14.83f

    .line 214
    .line 215
    .line 216
    const v13, 0x41568f5c    # 13.41f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v8, v10, v13}, Lhd/q0;->u(FF)V

    .line 220
    .line 221
    .line 222
    const v10, 0x3fb47ae1    # 1.41f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v8, v12, v10}, Lhd/q0;->t(FF)V

    .line 226
    .line 227
    .line 228
    const v10, 0x404851ec    # 3.13f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v8, v10, v10}, Lhd/q0;->t(FF)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v8, v11, v6}, Lhd/q0;->s(FF)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v8, v6, v6}, Lhd/q0;->s(FF)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v8, v9}, Lhd/q0;->z(F)V

    .line 241
    .line 242
    .line 243
    const v6, -0x3ffd70a4    # -2.04f

    .line 244
    .line 245
    .line 246
    const v9, 0x40028f5c    # 2.04f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v8, v6, v9}, Lhd/q0;->t(FF)V

    .line 250
    .line 251
    .line 252
    const v6, -0x3fb7ae14    # -3.13f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v8, v6, v6}, Lhd/q0;->t(FF)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v8}, Lhd/q0;->l()V

    .line 259
    .line 260
    .line 261
    iget-object v6, v8, Lhd/q0;->b:Ljava/util/ArrayList;

    .line 262
    .line 263
    const/4 v8, 0x0

    .line 264
    invoke-static {v15, v6, v8, v7}, Lw1/e;->a(Lw1/e;Ljava/util/ArrayList;ILq1/n0;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v15}, Lw1/e;->b()Lw1/f;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    sput-object v7, Lnh/b;->k:Lw1/f;

    .line 272
    .line 273
    :goto_1
    invoke-static {v7, v14}, Lw1/b;->c(Lw1/f;Lx0/o;)Lw1/i0;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    const v6, 0x7f0c018b

    .line 278
    .line 279
    .line 280
    invoke-static {v6}, Lna/q;->g(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    invoke-virtual {v14, v1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    invoke-virtual {v14, v4}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    or-int/2addr v6, v7

    .line 293
    invoke-virtual {v14}, Lx0/o;->K()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    if-nez v6, :cond_4

    .line 298
    .line 299
    if-ne v7, v3, :cond_5

    .line 300
    .line 301
    :cond_4
    new-instance v7, Lba/c;

    .line 302
    .line 303
    const/16 v3, 0x15

    .line 304
    .line 305
    invoke-direct {v7, v1, v5, v4, v3}, Lba/c;-><init>(Ljava/lang/Object;Lx0/w0;Ljava/lang/Object;I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v14, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    :cond_5
    move-object v13, v7

    .line 312
    check-cast v13, Lic/a;

    .line 313
    .line 314
    const/16 v15, 0x40

    .line 315
    .line 316
    const/16 v16, 0x15

    .line 317
    .line 318
    const/4 v7, 0x0

    .line 319
    const-wide/16 v9, 0x0

    .line 320
    .line 321
    const/4 v12, 0x0

    .line 322
    invoke-static/range {v7 .. v16}, Lka/b;->g(Lj1/q;Lv1/b;JLjava/lang/String;Lic/n;Lic/a;Lx0/o;II)V

    .line 323
    .line 324
    .line 325
    goto :goto_2

    .line 326
    :cond_6
    invoke-virtual {v14}, Lx0/o;->Q()V

    .line 327
    .line 328
    .line 329
    :goto_2
    return-object v2

    .line 330
    :pswitch_0
    move-object/from16 v1, p1

    .line 331
    .line 332
    check-cast v1, Lq/m1;

    .line 333
    .line 334
    move-object/from16 v6, p2

    .line 335
    .line 336
    check-cast v6, Lx0/o;

    .line 337
    .line 338
    move-object/from16 v7, p3

    .line 339
    .line 340
    check-cast v7, Ljava/lang/Integer;

    .line 341
    .line 342
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 343
    .line 344
    .line 345
    move-result v7

    .line 346
    const-string v8, "$this$SharedTransitionLayout"

    .line 347
    .line 348
    invoke-static {v1, v8}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    and-int/lit8 v8, v7, 0x6

    .line 352
    .line 353
    const/4 v9, 0x2

    .line 354
    if-nez v8, :cond_8

    .line 355
    .line 356
    invoke-virtual {v6, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v8

    .line 360
    if-eqz v8, :cond_7

    .line 361
    .line 362
    const/4 v8, 0x4

    .line 363
    goto :goto_3

    .line 364
    :cond_7
    const/4 v8, 0x2

    .line 365
    :goto_3
    or-int/2addr v7, v8

    .line 366
    :cond_8
    and-int/lit8 v8, v7, 0x13

    .line 367
    .line 368
    const/16 v10, 0x12

    .line 369
    .line 370
    if-eq v8, v10, :cond_9

    .line 371
    .line 372
    const/4 v8, 0x1

    .line 373
    goto :goto_4

    .line 374
    :cond_9
    const/4 v8, 0x0

    .line 375
    :goto_4
    and-int/2addr v7, v5

    .line 376
    invoke-virtual {v6, v7, v8}, Lx0/o;->N(IZ)Z

    .line 377
    .line 378
    .line 379
    move-result v7

    .line 380
    if-eqz v7, :cond_c

    .line 381
    .line 382
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 383
    .line 384
    const v8, 0x1dd68e42

    .line 385
    .line 386
    .line 387
    invoke-virtual {v6, v8}, Lx0/o;->W(I)V

    .line 388
    .line 389
    .line 390
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 391
    .line 392
    .line 393
    move-result-object v8

    .line 394
    new-instance v10, Ljc/y;

    .line 395
    .line 396
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 397
    .line 398
    .line 399
    const v11, 0x6e3c21fe

    .line 400
    .line 401
    .line 402
    invoke-virtual {v6, v11}, Lx0/o;->W(I)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v6}, Lx0/o;->K()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v11

    .line 409
    if-ne v11, v3, :cond_a

    .line 410
    .line 411
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 412
    .line 413
    invoke-static {v3}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    const-string v11, "sharedElementTranslation"

    .line 418
    .line 419
    invoke-static {v11, v7, v8, v5, v3}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 420
    .line 421
    .line 422
    move-result-object v11

    .line 423
    invoke-virtual {v6, v11}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    :cond_a
    check-cast v11, Lfg/f;

    .line 427
    .line 428
    const/4 v8, 0x0

    .line 429
    invoke-virtual {v6, v8}, Lx0/o;->p(Z)V

    .line 430
    .line 431
    .line 432
    iput-object v11, v10, Ljc/y;->a:Ljava/lang/Object;

    .line 433
    .line 434
    new-instance v3, La9/t;

    .line 435
    .line 436
    invoke-direct {v3, v10, v8}, La9/t;-><init>(Ljc/y;I)V

    .line 437
    .line 438
    .line 439
    invoke-static {v11, v3, v6}, Lx0/v;->c(Ljava/lang/Object;Lic/k;Lx0/o;)V

    .line 440
    .line 441
    .line 442
    iget-object v3, v10, Ljc/y;->a:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v3, Lfg/f;

    .line 445
    .line 446
    invoke-virtual {v6, v8}, Lx0/o;->p(Z)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v3}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    check-cast v3, Ljava/lang/Boolean;

    .line 454
    .line 455
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    if-eqz v3, :cond_b

    .line 460
    .line 461
    goto :goto_5

    .line 462
    :cond_b
    new-instance v3, La9/f;

    .line 463
    .line 464
    invoke-direct {v3, v1}, La9/f;-><init>(Lq/m1;)V

    .line 465
    .line 466
    .line 467
    move-object v1, v3

    .line 468
    :goto_5
    sget-object v3, La9/u;->c:Lx0/o2;

    .line 469
    .line 470
    invoke-virtual {v3, v4}, Lx0/o2;->a(Ljava/lang/Object;)Lx0/n1;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    sget-object v7, Lm0/j1;->a:Lx0/z;

    .line 475
    .line 476
    sget-object v8, Lm0/c1;->a:Lx0/o2;

    .line 477
    .line 478
    invoke-virtual {v6, v8}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    check-cast v8, Lm0/b1;

    .line 483
    .line 484
    invoke-virtual {v8}, Lm0/b1;->c()J

    .line 485
    .line 486
    .line 487
    move-result-wide v10

    .line 488
    new-instance v8, Lq1/q;

    .line 489
    .line 490
    invoke-direct {v8, v10, v11}, Lq1/q;-><init>(J)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v7, v8}, Lx0/z;->a(Ljava/lang/Object;)Lx0/n1;

    .line 494
    .line 495
    .line 496
    move-result-object v7

    .line 497
    sget-object v8, La9/u;->a:Lx0/o2;

    .line 498
    .line 499
    invoke-virtual {v8, v1}, Lx0/o2;->a(Ljava/lang/Object;)Lx0/n1;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    const/4 v8, 0x3

    .line 504
    new-array v8, v8, [Lx0/n1;

    .line 505
    .line 506
    const/4 v10, 0x0

    .line 507
    aput-object v3, v8, v10

    .line 508
    .line 509
    aput-object v7, v8, v5

    .line 510
    .line 511
    aput-object v1, v8, v9

    .line 512
    .line 513
    new-instance v1, La9/r;

    .line 514
    .line 515
    invoke-direct {v1, v10, v4}, La9/r;-><init>(ILjava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    const v3, 0x63c3f40a    # 7.2294E21f

    .line 519
    .line 520
    .line 521
    invoke-static {v3, v1, v6}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    const/16 v3, 0x38

    .line 526
    .line 527
    invoke-static {v8, v1, v6, v3}, Lx0/v;->b([Lx0/n1;Lic/n;Lx0/o;I)V

    .line 528
    .line 529
    .line 530
    goto :goto_6

    .line 531
    :cond_c
    invoke-virtual {v6}, Lx0/o;->Q()V

    .line 532
    .line 533
    .line 534
    :goto_6
    return-object v2

    .line 535
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
.end method
