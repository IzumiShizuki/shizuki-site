.class public abstract Landroidx/compose/animation/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:J

.field public static final synthetic b:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const/16 v2, 0x20

    .line 5
    .line 6
    shl-long v2, v0, v2

    .line 7
    .line 8
    const-wide v4, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    and-long/2addr v0, v4

    .line 14
    or-long/2addr v0, v2

    .line 15
    sput-wide v0, Landroidx/compose/animation/a;->a:J

    .line 16
    .line 17
    return-void
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
.end method

.method public static final a(Lr/q1;Lj1/q;Lic/k;Lj1/d;Lic/k;Lf1/f;Lx0/o;I)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v8, p3

    .line 8
    .line 9
    move-object/from16 v9, p4

    .line 10
    .line 11
    move-object/from16 v10, p6

    .line 12
    .line 13
    move/from16 v11, p7

    .line 14
    .line 15
    const v0, -0x6d60584

    .line 16
    .line 17
    .line 18
    invoke-virtual {v10, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v0, v11, 0x6

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v10, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const/4 v0, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v0, 0x2

    .line 35
    :goto_0
    or-int/2addr v0, v11

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v0, v11

    .line 38
    :goto_1
    and-int/lit8 v4, v11, 0x30

    .line 39
    .line 40
    if-nez v4, :cond_3

    .line 41
    .line 42
    invoke-virtual {v10, v7}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    const/16 v4, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v4, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v0, v4

    .line 54
    :cond_3
    and-int/lit16 v4, v11, 0x180

    .line 55
    .line 56
    if-nez v4, :cond_5

    .line 57
    .line 58
    invoke-virtual {v10, v3}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    const/16 v4, 0x100

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v4, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v0, v4

    .line 70
    :cond_5
    and-int/lit16 v4, v11, 0xc00

    .line 71
    .line 72
    if-nez v4, :cond_7

    .line 73
    .line 74
    invoke-virtual {v10, v8}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_6

    .line 79
    .line 80
    const/16 v4, 0x800

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    const/16 v4, 0x400

    .line 84
    .line 85
    :goto_4
    or-int/2addr v0, v4

    .line 86
    :cond_7
    and-int/lit16 v4, v11, 0x6000

    .line 87
    .line 88
    if-nez v4, :cond_9

    .line 89
    .line 90
    invoke-virtual {v10, v9}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_8

    .line 95
    .line 96
    const/16 v4, 0x4000

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    const/16 v4, 0x2000

    .line 100
    .line 101
    :goto_5
    or-int/2addr v0, v4

    .line 102
    :cond_9
    const/high16 v4, 0x30000

    .line 103
    .line 104
    and-int/2addr v4, v11

    .line 105
    move-object/from16 v6, p5

    .line 106
    .line 107
    if-nez v4, :cond_b

    .line 108
    .line 109
    invoke-virtual {v10, v6}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_a

    .line 114
    .line 115
    const/high16 v4, 0x20000

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_a
    const/high16 v4, 0x10000

    .line 119
    .line 120
    :goto_6
    or-int/2addr v0, v4

    .line 121
    :cond_b
    const v4, 0x12493

    .line 122
    .line 123
    .line 124
    and-int/2addr v4, v0

    .line 125
    const v5, 0x12492

    .line 126
    .line 127
    .line 128
    const/4 v12, 0x1

    .line 129
    const/4 v13, 0x0

    .line 130
    if-eq v4, v5, :cond_c

    .line 131
    .line 132
    const/4 v4, 0x1

    .line 133
    goto :goto_7

    .line 134
    :cond_c
    const/4 v4, 0x0

    .line 135
    :goto_7
    and-int/lit8 v5, v0, 0x1

    .line 136
    .line 137
    invoke-virtual {v10, v5, v4}, Lx0/o;->N(IZ)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-eqz v4, :cond_32

    .line 142
    .line 143
    sget-object v4, Lj2/l1;->n:Lx0/o2;

    .line 144
    .line 145
    invoke-virtual {v10, v4}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    check-cast v4, Lf3/m;

    .line 150
    .line 151
    and-int/lit8 v0, v0, 0xe

    .line 152
    .line 153
    if-ne v0, v2, :cond_d

    .line 154
    .line 155
    const/4 v4, 0x1

    .line 156
    goto :goto_8

    .line 157
    :cond_d
    const/4 v4, 0x0

    .line 158
    :goto_8
    invoke-virtual {v10}, Lx0/o;->K()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    sget-object v14, Lx0/k;->a:Lx0/r0;

    .line 163
    .line 164
    if-nez v4, :cond_e

    .line 165
    .line 166
    if-ne v5, v14, :cond_f

    .line 167
    .line 168
    :cond_e
    new-instance v5, Lq/m;

    .line 169
    .line 170
    invoke-direct {v5, v1, v8}, Lq/m;-><init>(Lr/q1;Lj1/d;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v10, v5}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_f
    move-object v4, v5

    .line 177
    check-cast v4, Lq/m;

    .line 178
    .line 179
    if-ne v0, v2, :cond_10

    .line 180
    .line 181
    const/4 v5, 0x1

    .line 182
    goto :goto_9

    .line 183
    :cond_10
    const/4 v5, 0x0

    .line 184
    :goto_9
    invoke-virtual {v10}, Lx0/o;->K()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v15

    .line 188
    if-nez v5, :cond_11

    .line 189
    .line 190
    if-ne v15, v14, :cond_12

    .line 191
    .line 192
    :cond_11
    iget-object v5, v1, Lr/q1;->a:Landroidx/lifecycle/q;

    .line 193
    .line 194
    invoke-virtual {v5}, Landroidx/lifecycle/q;->b1()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    new-array v15, v12, [Ljava/lang/Object;

    .line 199
    .line 200
    aput-object v5, v15, v13

    .line 201
    .line 202
    new-instance v5, Lh1/s;

    .line 203
    .line 204
    invoke-direct {v5}, Lh1/s;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-static {v15}, Lvb/l;->M0([Ljava/lang/Object;)Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v15

    .line 211
    check-cast v15, Ljava/util/Collection;

    .line 212
    .line 213
    invoke-virtual {v5, v15}, Lh1/s;->addAll(Ljava/util/Collection;)Z

    .line 214
    .line 215
    .line 216
    invoke-virtual {v10, v5}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    move-object v15, v5

    .line 220
    :cond_12
    move-object v5, v15

    .line 221
    check-cast v5, Lh1/s;

    .line 222
    .line 223
    if-ne v0, v2, :cond_13

    .line 224
    .line 225
    const/4 v0, 0x1

    .line 226
    goto :goto_a

    .line 227
    :cond_13
    const/4 v0, 0x0

    .line 228
    :goto_a
    invoke-virtual {v10}, Lx0/o;->K()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    if-nez v0, :cond_14

    .line 233
    .line 234
    if-ne v2, v14, :cond_15

    .line 235
    .line 236
    :cond_14
    sget-object v0, Lo/s0;->a:[J

    .line 237
    .line 238
    new-instance v2, Lo/k0;

    .line 239
    .line 240
    invoke-direct {v2}, Lo/k0;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v10, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :cond_15
    move-object v15, v2

    .line 247
    check-cast v15, Lo/k0;

    .line 248
    .line 249
    iget-object v0, v1, Lr/q1;->a:Landroidx/lifecycle/q;

    .line 250
    .line 251
    iget-object v2, v1, Lr/q1;->d:Lx0/e1;

    .line 252
    .line 253
    invoke-virtual {v0}, Landroidx/lifecycle/q;->b1()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v13

    .line 257
    invoke-virtual {v5, v13}, Lh1/s;->contains(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v13

    .line 261
    if-nez v13, :cond_16

    .line 262
    .line 263
    invoke-virtual {v5}, Lh1/s;->clear()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0}, Landroidx/lifecycle/q;->b1()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    invoke-virtual {v5, v13}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    :cond_16
    invoke-virtual {v0}, Landroidx/lifecycle/q;->b1()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v13

    .line 277
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    invoke-static {v13, v12}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v12

    .line 285
    if-eqz v12, :cond_1b

    .line 286
    .line 287
    invoke-virtual {v5}, Lh1/s;->size()I

    .line 288
    .line 289
    .line 290
    move-result v12

    .line 291
    const/4 v13, 0x1

    .line 292
    if-ne v12, v13, :cond_17

    .line 293
    .line 294
    const/4 v12, 0x0

    .line 295
    invoke-virtual {v5, v12}, Lh1/s;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v13

    .line 299
    invoke-virtual {v0}, Landroidx/lifecycle/q;->b1()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v12

    .line 303
    invoke-static {v13, v12}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v12

    .line 307
    if-nez v12, :cond_18

    .line 308
    .line 309
    :cond_17
    invoke-virtual {v5}, Lh1/s;->clear()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Landroidx/lifecycle/q;->b1()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v12

    .line 316
    invoke-virtual {v5, v12}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    :cond_18
    iget v12, v15, Lo/k0;->e:I

    .line 320
    .line 321
    const/4 v13, 0x1

    .line 322
    if-ne v12, v13, :cond_19

    .line 323
    .line 324
    invoke-virtual {v0}, Landroidx/lifecycle/q;->b1()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v12

    .line 328
    invoke-virtual {v15, v12}, Lo/k0;->c(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v12

    .line 332
    if-eqz v12, :cond_1a

    .line 333
    .line 334
    :cond_19
    invoke-virtual {v15}, Lo/k0;->a()V

    .line 335
    .line 336
    .line 337
    :cond_1a
    iput-object v8, v4, Lq/m;->b:Lj1/d;

    .line 338
    .line 339
    :cond_1b
    invoke-virtual {v0}, Landroidx/lifecycle/q;->b1()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v12

    .line 343
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v13

    .line 347
    invoke-static {v12, v13}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v12

    .line 351
    if-nez v12, :cond_1f

    .line 352
    .line 353
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v12

    .line 357
    invoke-virtual {v5, v12}, Lh1/s;->contains(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v12

    .line 361
    if-nez v12, :cond_1f

    .line 362
    .line 363
    invoke-virtual {v5}, Lh1/s;->listIterator()Ljava/util/ListIterator;

    .line 364
    .line 365
    .line 366
    move-result-object v12

    .line 367
    const/4 v13, 0x0

    .line 368
    :goto_b
    move-object/from16 v16, v12

    .line 369
    .line 370
    check-cast v16, Lh1/z;

    .line 371
    .line 372
    invoke-virtual/range {v16 .. v16}, Lh1/z;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v17

    .line 376
    move-object/from16 v18, v0

    .line 377
    .line 378
    if-eqz v17, :cond_1d

    .line 379
    .line 380
    invoke-virtual/range {v16 .. v16}, Lh1/z;->next()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-interface {v9, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    invoke-interface {v9, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    invoke-static {v0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-eqz v0, :cond_1c

    .line 401
    .line 402
    :goto_c
    const/4 v0, -0x1

    .line 403
    goto :goto_d

    .line 404
    :cond_1c
    add-int/lit8 v13, v13, 0x1

    .line 405
    .line 406
    move-object/from16 v1, p0

    .line 407
    .line 408
    move-object/from16 v0, v18

    .line 409
    .line 410
    goto :goto_b

    .line 411
    :cond_1d
    const/4 v13, -0x1

    .line 412
    goto :goto_c

    .line 413
    :goto_d
    if-ne v13, v0, :cond_1e

    .line 414
    .line 415
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-virtual {v5, v0}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    goto :goto_e

    .line 423
    :cond_1e
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-virtual {v5, v13, v0}, Lh1/s;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    goto :goto_e

    .line 431
    :cond_1f
    move-object/from16 v18, v0

    .line 432
    .line 433
    :goto_e
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v15, v0}, Lo/k0;->c(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-eqz v0, :cond_21

    .line 442
    .line 443
    invoke-virtual/range {v18 .. v18}, Landroidx/lifecycle/q;->b1()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v15, v0}, Lo/k0;->c(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-nez v0, :cond_20

    .line 452
    .line 453
    goto :goto_f

    .line 454
    :cond_20
    const v0, 0x36ce4d57

    .line 455
    .line 456
    .line 457
    invoke-virtual {v10, v0}, Lx0/o;->W(I)V

    .line 458
    .line 459
    .line 460
    const/4 v12, 0x0

    .line 461
    invoke-virtual {v10, v12}, Lx0/o;->p(Z)V

    .line 462
    .line 463
    .line 464
    move-object v6, v3

    .line 465
    move-object v0, v4

    .line 466
    goto :goto_11

    .line 467
    :cond_21
    :goto_f
    const v0, 0x36a6df16

    .line 468
    .line 469
    .line 470
    invoke-virtual {v10, v0}, Lx0/o;->W(I)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v15}, Lo/k0;->a()V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v5}, Lh1/s;->size()I

    .line 477
    .line 478
    .line 479
    move-result v12

    .line 480
    const/4 v13, 0x0

    .line 481
    :goto_10
    if-ge v13, v12, :cond_22

    .line 482
    .line 483
    invoke-virtual {v5, v13}, Lh1/s;->get(I)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    new-instance v0, Lq/c;

    .line 488
    .line 489
    move-object/from16 v1, p0

    .line 490
    .line 491
    invoke-direct/range {v0 .. v6}, Lq/c;-><init>(Lr/q1;Ljava/lang/Object;Lic/k;Lq/m;Lh1/s;Lf1/f;)V

    .line 492
    .line 493
    .line 494
    move-object v1, v0

    .line 495
    move-object v6, v3

    .line 496
    move-object v0, v4

    .line 497
    const v3, 0x34c9ce26

    .line 498
    .line 499
    .line 500
    invoke-static {v3, v1, v10}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    invoke-virtual {v15, v2, v1}, Lo/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    add-int/lit8 v13, v13, 0x1

    .line 508
    .line 509
    move-object v3, v6

    .line 510
    move-object/from16 v6, p5

    .line 511
    .line 512
    goto :goto_10

    .line 513
    :cond_22
    move-object v6, v3

    .line 514
    move-object v0, v4

    .line 515
    const/4 v1, 0x0

    .line 516
    invoke-virtual {v10, v1}, Lx0/o;->p(Z)V

    .line 517
    .line 518
    .line 519
    :goto_11
    invoke-virtual/range {p0 .. p0}, Lr/q1;->f()Lr/k1;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    invoke-virtual {v10, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    invoke-virtual {v10, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    or-int/2addr v1, v2

    .line 532
    invoke-virtual {v10}, Lx0/o;->K()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    if-nez v1, :cond_23

    .line 537
    .line 538
    if-ne v2, v14, :cond_24

    .line 539
    .line 540
    :cond_23
    invoke-interface {v6, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    move-object v2, v1

    .line 545
    check-cast v2, Lq/b0;

    .line 546
    .line 547
    invoke-virtual {v10, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    :cond_24
    check-cast v2, Lq/b0;

    .line 551
    .line 552
    iget-object v1, v0, Lq/m;->a:Lr/q1;

    .line 553
    .line 554
    invoke-virtual {v10, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    invoke-virtual {v10}, Lx0/o;->K()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v4

    .line 562
    if-nez v3, :cond_25

    .line 563
    .line 564
    if-ne v4, v14, :cond_26

    .line 565
    .line 566
    :cond_25
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 567
    .line 568
    invoke-static {v3}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 569
    .line 570
    .line 571
    move-result-object v4

    .line 572
    invoke-virtual {v10, v4}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    :cond_26
    check-cast v4, Lx0/w0;

    .line 576
    .line 577
    iget-object v2, v2, Lq/b0;->d:Lq/v1;

    .line 578
    .line 579
    invoke-static {v2, v10}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 580
    .line 581
    .line 582
    move-result-object v12

    .line 583
    iget-object v2, v1, Lr/q1;->a:Landroidx/lifecycle/q;

    .line 584
    .line 585
    invoke-virtual {v2}, Landroidx/lifecycle/q;->b1()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    iget-object v1, v1, Lr/q1;->d:Lx0/e1;

    .line 590
    .line 591
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    invoke-static {v2, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v1

    .line 599
    if-eqz v1, :cond_27

    .line 600
    .line 601
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 602
    .line 603
    invoke-interface {v4, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    goto :goto_12

    .line 607
    :cond_27
    invoke-interface {v12}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    if-eqz v1, :cond_28

    .line 612
    .line 613
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 614
    .line 615
    invoke-interface {v4, v1}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    :cond_28
    :goto_12
    invoke-interface {v4}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    check-cast v1, Ljava/lang/Boolean;

    .line 623
    .line 624
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 625
    .line 626
    .line 627
    move-result v1

    .line 628
    sget-object v13, Lj1/n;->a:Lj1/n;

    .line 629
    .line 630
    if-eqz v1, :cond_2b

    .line 631
    .line 632
    const v1, 0xee1c2b3

    .line 633
    .line 634
    .line 635
    invoke-virtual {v10, v1}, Lx0/o;->W(I)V

    .line 636
    .line 637
    .line 638
    move-object v4, v0

    .line 639
    iget-object v0, v4, Lq/m;->a:Lr/q1;

    .line 640
    .line 641
    sget-object v1, Lr/w1;->h:Lr/v1;

    .line 642
    .line 643
    move-object v2, v4

    .line 644
    const/4 v4, 0x0

    .line 645
    move-object v3, v5

    .line 646
    const/4 v5, 0x2

    .line 647
    move-object/from16 v16, v2

    .line 648
    .line 649
    const/4 v2, 0x0

    .line 650
    move-object/from16 v19, v16

    .line 651
    .line 652
    move-object/from16 v16, v3

    .line 653
    .line 654
    move-object v3, v10

    .line 655
    move-object/from16 v10, v19

    .line 656
    .line 657
    invoke-static/range {v0 .. v5}, Lr/t1;->c(Lr/q1;Lr/v1;Ljava/lang/String;Lx0/o;II)Lr/j1;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-virtual {v3, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v1

    .line 665
    invoke-virtual {v3}, Lx0/o;->K()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    if-nez v1, :cond_29

    .line 670
    .line 671
    if-ne v2, v14, :cond_2a

    .line 672
    .line 673
    :cond_29
    invoke-interface {v12}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    check-cast v1, Lq/v1;

    .line 678
    .line 679
    invoke-static {v13}, Lgh/g;->l(Lj1/q;)Lj1/q;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    invoke-virtual {v3, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    :cond_2a
    move-object v13, v2

    .line 687
    check-cast v13, Lj1/q;

    .line 688
    .line 689
    const/4 v1, 0x0

    .line 690
    invoke-virtual {v3, v1}, Lx0/o;->p(Z)V

    .line 691
    .line 692
    .line 693
    goto :goto_13

    .line 694
    :cond_2b
    move-object/from16 v16, v5

    .line 695
    .line 696
    move-object v3, v10

    .line 697
    const/4 v1, 0x0

    .line 698
    move-object v10, v0

    .line 699
    const v0, 0xee5d1ed

    .line 700
    .line 701
    .line 702
    invoke-virtual {v3, v0}, Lx0/o;->W(I)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v3, v1}, Lx0/o;->p(Z)V

    .line 706
    .line 707
    .line 708
    const/4 v0, 0x0

    .line 709
    :goto_13
    new-instance v1, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;

    .line 710
    .line 711
    invoke-direct {v1, v0, v12, v10}, Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;-><init>(Lr/j1;Lx0/w0;Lq/m;)V

    .line 712
    .line 713
    .line 714
    invoke-interface {v13, v1}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    invoke-interface {v7, v0}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    invoke-virtual {v3}, Lx0/o;->K()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    if-ne v1, v14, :cond_2c

    .line 727
    .line 728
    new-instance v1, Lq/g;

    .line 729
    .line 730
    invoke-direct {v1, v10}, Lq/g;-><init>(Lq/m;)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v3, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    :cond_2c
    check-cast v1, Lq/g;

    .line 737
    .line 738
    invoke-static {v3}, Lx0/v;->q(Lx0/o;)I

    .line 739
    .line 740
    .line 741
    move-result v2

    .line 742
    invoke-virtual {v3}, Lx0/o;->l()Lx0/j1;

    .line 743
    .line 744
    .line 745
    move-result-object v4

    .line 746
    invoke-static {v0, v3}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    sget-object v5, Li2/k;->g0:Li2/j;

    .line 751
    .line 752
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    sget-object v5, Li2/j;->b:Li2/i;

    .line 756
    .line 757
    invoke-virtual {v3}, Lx0/o;->a0()V

    .line 758
    .line 759
    .line 760
    iget-boolean v10, v3, Lx0/o;->S:Z

    .line 761
    .line 762
    if-eqz v10, :cond_2d

    .line 763
    .line 764
    invoke-virtual {v3, v5}, Lx0/o;->k(Lic/a;)V

    .line 765
    .line 766
    .line 767
    goto :goto_14

    .line 768
    :cond_2d
    invoke-virtual {v3}, Lx0/o;->k0()V

    .line 769
    .line 770
    .line 771
    :goto_14
    sget-object v5, Li2/j;->g:Li2/h;

    .line 772
    .line 773
    invoke-static {v5, v1, v3}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 774
    .line 775
    .line 776
    sget-object v1, Li2/j;->f:Li2/h;

    .line 777
    .line 778
    invoke-static {v1, v4, v3}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 779
    .line 780
    .line 781
    sget-object v1, Li2/j;->j:Li2/h;

    .line 782
    .line 783
    iget-boolean v4, v3, Lx0/o;->S:Z

    .line 784
    .line 785
    if-nez v4, :cond_2e

    .line 786
    .line 787
    invoke-virtual {v3}, Lx0/o;->K()Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v4

    .line 791
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 792
    .line 793
    .line 794
    move-result-object v5

    .line 795
    invoke-static {v4, v5}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    move-result v4

    .line 799
    if-nez v4, :cond_2f

    .line 800
    .line 801
    :cond_2e
    invoke-static {v2, v3, v2, v1}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 802
    .line 803
    .line 804
    :cond_2f
    sget-object v1, Li2/j;->d:Li2/h;

    .line 805
    .line 806
    invoke-static {v1, v0, v3}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 807
    .line 808
    .line 809
    const v0, -0x58dcefd6

    .line 810
    .line 811
    .line 812
    invoke-virtual {v3, v0}, Lx0/o;->W(I)V

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v16 .. v16}, Lh1/s;->size()I

    .line 816
    .line 817
    .line 818
    move-result v0

    .line 819
    const/4 v12, 0x0

    .line 820
    :goto_15
    if-ge v12, v0, :cond_31

    .line 821
    .line 822
    move-object/from16 v5, v16

    .line 823
    .line 824
    invoke-virtual {v5, v12}, Lh1/s;->get(I)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    const v2, 0x71c084d9

    .line 829
    .line 830
    .line 831
    invoke-interface {v9, v1}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v4

    .line 835
    invoke-virtual {v3, v2, v4}, Lx0/o;->U(ILjava/lang/Object;)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v15, v1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v1

    .line 842
    check-cast v1, Lic/n;

    .line 843
    .line 844
    if-nez v1, :cond_30

    .line 845
    .line 846
    const v1, -0x39af5b50

    .line 847
    .line 848
    .line 849
    invoke-virtual {v3, v1}, Lx0/o;->W(I)V

    .line 850
    .line 851
    .line 852
    const/4 v2, 0x0

    .line 853
    :goto_16
    invoke-virtual {v3, v2}, Lx0/o;->p(Z)V

    .line 854
    .line 855
    .line 856
    goto :goto_17

    .line 857
    :cond_30
    const/4 v2, 0x0

    .line 858
    const v4, 0x71c08971

    .line 859
    .line 860
    .line 861
    invoke-virtual {v3, v4}, Lx0/o;->W(I)V

    .line 862
    .line 863
    .line 864
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 865
    .line 866
    .line 867
    move-result-object v4

    .line 868
    invoke-interface {v1, v3, v4}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    goto :goto_16

    .line 872
    :goto_17
    invoke-virtual {v3, v2}, Lx0/o;->p(Z)V

    .line 873
    .line 874
    .line 875
    add-int/lit8 v12, v12, 0x1

    .line 876
    .line 877
    move-object/from16 v16, v5

    .line 878
    .line 879
    goto :goto_15

    .line 880
    :cond_31
    const/4 v2, 0x0

    .line 881
    invoke-virtual {v3, v2}, Lx0/o;->p(Z)V

    .line 882
    .line 883
    .line 884
    const/4 v13, 0x1

    .line 885
    invoke-virtual {v3, v13}, Lx0/o;->p(Z)V

    .line 886
    .line 887
    .line 888
    goto :goto_18

    .line 889
    :cond_32
    move-object v6, v3

    .line 890
    move-object v3, v10

    .line 891
    invoke-virtual {v3}, Lx0/o;->Q()V

    .line 892
    .line 893
    .line 894
    :goto_18
    invoke-virtual {v3}, Lx0/o;->r()Lx0/p1;

    .line 895
    .line 896
    .line 897
    move-result-object v10

    .line 898
    if-eqz v10, :cond_33

    .line 899
    .line 900
    new-instance v0, Lq/d;

    .line 901
    .line 902
    move-object/from16 v1, p0

    .line 903
    .line 904
    move-object v3, v6

    .line 905
    move-object v2, v7

    .line 906
    move-object v4, v8

    .line 907
    move-object v5, v9

    .line 908
    move v7, v11

    .line 909
    move-object/from16 v6, p5

    .line 910
    .line 911
    invoke-direct/range {v0 .. v7}, Lq/d;-><init>(Lr/q1;Lj1/q;Lic/k;Lj1/d;Lic/k;Lf1/f;I)V

    .line 912
    .line 913
    .line 914
    iput-object v0, v10, Lx0/p1;->d:Lic/n;

    .line 915
    .line 916
    :cond_33
    return-void
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
.end method
