.class public final Lc2/j;
.super Lc2/k;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final c:Lj1/p;

.field public final d:Ld2/b;

.field public final e:Lo/s;

.field public f:Li2/g1;

.field public g:Lc2/l;

.field public h:Z

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Lj1/p;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc2/k;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc2/j;->c:Lj1/p;

    .line 5
    .line 6
    new-instance p1, Ld2/b;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p1, v1, v0}, Ld2/b;-><init>(BI)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    new-array v1, v0, [J

    .line 15
    .line 16
    iput-object v1, p1, Ld2/b;->c:[J

    .line 17
    .line 18
    iput-object p1, p0, Lc2/j;->d:Ld2/b;

    .line 19
    .line 20
    new-instance p1, Lo/s;

    .line 21
    .line 22
    invoke-direct {p1, v0}, Lo/s;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lc2/j;->e:Lo/s;

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Lc2/j;->i:Z

    .line 29
    .line 30
    iput-boolean p1, p0, Lc2/j;->j:Z

    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final a(Lo/s;Lg2/c0;Lb7/n;Z)Z
    .locals 52

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-super/range {p0 .. p4}, Lc2/k;->a(Lo/s;Lg2/c0;Lb7/n;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget-object v5, v0, Lc2/j;->c:Lj1/p;

    .line 14
    .line 15
    iget-boolean v6, v5, Lj1/p;->n:Z

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    if-nez v6, :cond_0

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_0
    const/4 v8, 0x0

    .line 22
    :goto_0
    if-eqz v5, :cond_8

    .line 23
    .line 24
    instance-of v10, v5, Li2/u1;

    .line 25
    .line 26
    const/16 v11, 0x10

    .line 27
    .line 28
    if-eqz v10, :cond_1

    .line 29
    .line 30
    check-cast v5, Li2/u1;

    .line 31
    .line 32
    invoke-static {v5, v11}, Li2/f;->v(Li2/m;I)Li2/g1;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iput-object v5, v0, Lc2/j;->f:Li2/g1;

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_1
    iget v10, v5, Lj1/p;->c:I

    .line 40
    .line 41
    and-int/2addr v10, v11

    .line 42
    if-eqz v10, :cond_7

    .line 43
    .line 44
    instance-of v10, v5, Li2/n;

    .line 45
    .line 46
    if-eqz v10, :cond_7

    .line 47
    .line 48
    move-object v10, v5

    .line 49
    check-cast v10, Li2/n;

    .line 50
    .line 51
    iget-object v10, v10, Li2/n;->p:Lj1/p;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    :goto_1
    if-eqz v10, :cond_6

    .line 55
    .line 56
    iget v12, v10, Lj1/p;->c:I

    .line 57
    .line 58
    and-int/2addr v12, v11

    .line 59
    if-eqz v12, :cond_5

    .line 60
    .line 61
    add-int/lit8 v9, v9, 0x1

    .line 62
    .line 63
    if-ne v9, v7, :cond_2

    .line 64
    .line 65
    move-object v5, v10

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    if-nez v8, :cond_3

    .line 68
    .line 69
    new-instance v8, Lz0/e;

    .line 70
    .line 71
    new-array v12, v11, [Lj1/p;

    .line 72
    .line 73
    invoke-direct {v8, v12}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    if-eqz v5, :cond_4

    .line 77
    .line 78
    invoke-virtual {v8, v5}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 v5, 0x0

    .line 82
    :cond_4
    invoke-virtual {v8, v10}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_2
    iget-object v10, v10, Lj1/p;->f:Lj1/p;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_6
    if-ne v9, v7, :cond_7

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_7
    :goto_3
    invoke-static {v8}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    goto :goto_0

    .line 96
    :cond_8
    iget-object v5, v0, Lc2/j;->f:Li2/g1;

    .line 97
    .line 98
    if-nez v5, :cond_9

    .line 99
    .line 100
    :goto_4
    return v7

    .line 101
    :cond_9
    invoke-virtual {v1}, Lo/s;->i()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    const/4 v8, 0x0

    .line 106
    :goto_5
    iget-object v10, v0, Lc2/j;->e:Lo/s;

    .line 107
    .line 108
    iget-object v11, v0, Lc2/j;->d:Ld2/b;

    .line 109
    .line 110
    if-ge v8, v5, :cond_12

    .line 111
    .line 112
    invoke-virtual {v1, v8}, Lo/s;->f(I)J

    .line 113
    .line 114
    .line 115
    move-result-wide v12

    .line 116
    invoke-virtual {v1, v8}, Lo/s;->j(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    check-cast v14, Lc2/t;

    .line 121
    .line 122
    invoke-virtual {v11, v12, v13}, Ld2/b;->c(J)Z

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    if-eqz v11, :cond_11

    .line 127
    .line 128
    const/4 v15, 0x1

    .line 129
    const/16 v16, 0x0

    .line 130
    .line 131
    iget-wide v6, v14, Lc2/t;->g:J

    .line 132
    .line 133
    iget-object v11, v14, Lc2/t;->k:Ljava/util/ArrayList;

    .line 134
    .line 135
    move-object/from16 v17, v10

    .line 136
    .line 137
    iget-wide v9, v14, Lc2/t;->c:J

    .line 138
    .line 139
    const-wide v18, 0x7fffffff7fffffffL

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    and-long v20, v6, v18

    .line 145
    .line 146
    const-wide v22, 0x7fffff007fffffL

    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    add-long v20, v20, v22

    .line 152
    .line 153
    const-wide v24, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    and-long v20, v20, v24

    .line 159
    .line 160
    const-wide/16 v26, 0x0

    .line 161
    .line 162
    cmp-long v28, v20, v26

    .line 163
    .line 164
    if-nez v28, :cond_10

    .line 165
    .line 166
    and-long v20, v9, v18

    .line 167
    .line 168
    add-long v20, v20, v22

    .line 169
    .line 170
    and-long v20, v20, v24

    .line 171
    .line 172
    cmp-long v28, v20, v26

    .line 173
    .line 174
    if-nez v28, :cond_10

    .line 175
    .line 176
    const/16 v20, 0x1

    .line 177
    .line 178
    new-instance v15, Ljava/util/ArrayList;

    .line 179
    .line 180
    sget-object v21, Lvb/r;->a:Lvb/r;

    .line 181
    .line 182
    if-nez v11, :cond_a

    .line 183
    .line 184
    move-object/from16 v28, v21

    .line 185
    .line 186
    :goto_6
    move/from16 v49, v4

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_a
    move-object/from16 v28, v11

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :goto_7
    invoke-interface/range {v28 .. v28}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 197
    .line 198
    .line 199
    if-nez v11, :cond_b

    .line 200
    .line 201
    move-object/from16 v11, v21

    .line 202
    .line 203
    :cond_b
    move-object v4, v11

    .line 204
    check-cast v4, Ljava/util/Collection;

    .line 205
    .line 206
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    move/from16 v21, v5

    .line 211
    .line 212
    const/4 v5, 0x0

    .line 213
    :goto_8
    if-ge v5, v4, :cond_d

    .line 214
    .line 215
    invoke-interface {v11, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v28

    .line 219
    move/from16 v29, v4

    .line 220
    .line 221
    move-object/from16 v4, v28

    .line 222
    .line 223
    check-cast v4, Lc2/c;

    .line 224
    .line 225
    move-wide/from16 v50, v12

    .line 226
    .line 227
    move-object v13, v11

    .line 228
    iget-wide v11, v4, Lc2/c;->b:J

    .line 229
    .line 230
    and-long v30, v11, v18

    .line 231
    .line 232
    add-long v30, v30, v22

    .line 233
    .line 234
    and-long v30, v30, v24

    .line 235
    .line 236
    cmp-long v28, v30, v26

    .line 237
    .line 238
    if-nez v28, :cond_c

    .line 239
    .line 240
    new-instance v30, Lc2/c;

    .line 241
    .line 242
    move-object/from16 v37, v13

    .line 243
    .line 244
    move-object/from16 v28, v14

    .line 245
    .line 246
    iget-wide v13, v4, Lc2/c;->a:J

    .line 247
    .line 248
    move/from16 v38, v5

    .line 249
    .line 250
    iget-object v5, v0, Lc2/j;->f:Li2/g1;

    .line 251
    .line 252
    invoke-static {v5}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5, v2, v11, v12}, Li2/g1;->V0(Lg2/c0;J)J

    .line 256
    .line 257
    .line 258
    move-result-wide v33

    .line 259
    iget-wide v4, v4, Lc2/c;->c:J

    .line 260
    .line 261
    move-wide/from16 v35, v4

    .line 262
    .line 263
    move-wide/from16 v31, v13

    .line 264
    .line 265
    invoke-direct/range {v30 .. v36}, Lc2/c;-><init>(JJJ)V

    .line 266
    .line 267
    .line 268
    move-object/from16 v4, v30

    .line 269
    .line 270
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    goto :goto_9

    .line 274
    :cond_c
    move/from16 v38, v5

    .line 275
    .line 276
    move-object/from16 v37, v13

    .line 277
    .line 278
    move-object/from16 v28, v14

    .line 279
    .line 280
    :goto_9
    add-int/lit8 v5, v38, 0x1

    .line 281
    .line 282
    move-object/from16 v14, v28

    .line 283
    .line 284
    move/from16 v4, v29

    .line 285
    .line 286
    move-object/from16 v11, v37

    .line 287
    .line 288
    move-wide/from16 v12, v50

    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_d
    move-wide/from16 v50, v12

    .line 292
    .line 293
    move-object/from16 v28, v14

    .line 294
    .line 295
    iget-object v4, v0, Lc2/j;->f:Li2/g1;

    .line 296
    .line 297
    invoke-static {v4}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4, v2, v6, v7}, Li2/g1;->V0(Lg2/c0;J)J

    .line 301
    .line 302
    .line 303
    move-result-wide v40

    .line 304
    iget-object v4, v0, Lc2/j;->f:Li2/g1;

    .line 305
    .line 306
    invoke-static {v4}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v4, v2, v9, v10}, Li2/g1;->V0(Lg2/c0;J)J

    .line 310
    .line 311
    .line 312
    move-result-wide v34

    .line 313
    iget-wide v4, v14, Lc2/t;->a:J

    .line 314
    .line 315
    iget-wide v6, v14, Lc2/t;->b:J

    .line 316
    .line 317
    iget-boolean v9, v14, Lc2/t;->d:Z

    .line 318
    .line 319
    iget-wide v10, v14, Lc2/t;->f:J

    .line 320
    .line 321
    iget-boolean v12, v14, Lc2/t;->h:Z

    .line 322
    .line 323
    iget v13, v14, Lc2/t;->i:I

    .line 324
    .line 325
    move-wide/from16 v30, v4

    .line 326
    .line 327
    iget-wide v4, v14, Lc2/t;->j:J

    .line 328
    .line 329
    iget v2, v14, Lc2/t;->e:F

    .line 330
    .line 331
    new-instance v29, Lc2/t;

    .line 332
    .line 333
    move-wide/from16 v45, v4

    .line 334
    .line 335
    iget-wide v4, v14, Lc2/t;->l:J

    .line 336
    .line 337
    move/from16 v37, v2

    .line 338
    .line 339
    move-wide/from16 v47, v4

    .line 340
    .line 341
    move-wide/from16 v32, v6

    .line 342
    .line 343
    move/from16 v36, v9

    .line 344
    .line 345
    move-wide/from16 v38, v10

    .line 346
    .line 347
    move/from16 v42, v12

    .line 348
    .line 349
    move/from16 v43, v13

    .line 350
    .line 351
    move-object/from16 v44, v15

    .line 352
    .line 353
    invoke-direct/range {v29 .. v48}, Lc2/t;-><init>(JJJZFJJZILjava/util/ArrayList;JJ)V

    .line 354
    .line 355
    .line 356
    move-object/from16 v2, v29

    .line 357
    .line 358
    iget-object v4, v14, Lc2/t;->o:Lc2/t;

    .line 359
    .line 360
    if-nez v4, :cond_e

    .line 361
    .line 362
    move-object v4, v14

    .line 363
    :cond_e
    iput-object v4, v2, Lc2/t;->o:Lc2/t;

    .line 364
    .line 365
    iget-object v4, v14, Lc2/t;->o:Lc2/t;

    .line 366
    .line 367
    if-nez v4, :cond_f

    .line 368
    .line 369
    goto :goto_a

    .line 370
    :cond_f
    move-object v14, v4

    .line 371
    :goto_a
    iput-object v14, v2, Lc2/t;->o:Lc2/t;

    .line 372
    .line 373
    move-object/from16 v6, v17

    .line 374
    .line 375
    move-wide/from16 v4, v50

    .line 376
    .line 377
    invoke-virtual {v6, v4, v5, v2}, Lo/s;->g(JLjava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    goto :goto_c

    .line 381
    :cond_10
    move/from16 v49, v4

    .line 382
    .line 383
    move/from16 v21, v5

    .line 384
    .line 385
    :goto_b
    const/16 v20, 0x1

    .line 386
    .line 387
    goto :goto_c

    .line 388
    :cond_11
    move/from16 v49, v4

    .line 389
    .line 390
    move/from16 v21, v5

    .line 391
    .line 392
    const/16 v16, 0x0

    .line 393
    .line 394
    goto :goto_b

    .line 395
    :goto_c
    add-int/lit8 v8, v8, 0x1

    .line 396
    .line 397
    move-object/from16 v2, p2

    .line 398
    .line 399
    move/from16 v5, v21

    .line 400
    .line 401
    move/from16 v4, v49

    .line 402
    .line 403
    const/4 v7, 0x1

    .line 404
    goto/16 :goto_5

    .line 405
    .line 406
    :cond_12
    move/from16 v49, v4

    .line 407
    .line 408
    move-object v6, v10

    .line 409
    const/16 v16, 0x0

    .line 410
    .line 411
    const/16 v20, 0x1

    .line 412
    .line 413
    invoke-virtual {v6}, Lo/s;->i()I

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    if-nez v2, :cond_13

    .line 418
    .line 419
    const/4 v2, 0x0

    .line 420
    iput v2, v11, Ld2/b;->b:I

    .line 421
    .line 422
    iget-object v1, v0, Lc2/k;->a:Lz0/e;

    .line 423
    .line 424
    invoke-virtual {v1}, Lz0/e;->g()V

    .line 425
    .line 426
    .line 427
    return v20

    .line 428
    :cond_13
    iget v2, v11, Ld2/b;->b:I

    .line 429
    .line 430
    add-int/lit8 v2, v2, -0x1

    .line 431
    .line 432
    :goto_d
    const/4 v4, -0x1

    .line 433
    if-ge v4, v2, :cond_1b

    .line 434
    .line 435
    iget-object v5, v11, Ld2/b;->c:[J

    .line 436
    .line 437
    aget-wide v7, v5, v2

    .line 438
    .line 439
    iget-boolean v5, v1, Lo/s;->a:Z

    .line 440
    .line 441
    if-eqz v5, :cond_17

    .line 442
    .line 443
    iget v5, v1, Lo/s;->d:I

    .line 444
    .line 445
    iget-object v9, v1, Lo/s;->b:[J

    .line 446
    .line 447
    iget-object v10, v1, Lo/s;->c:[Ljava/lang/Object;

    .line 448
    .line 449
    const/4 v12, 0x0

    .line 450
    const/4 v13, 0x0

    .line 451
    :goto_e
    if-ge v13, v5, :cond_16

    .line 452
    .line 453
    aget-object v14, v10, v13

    .line 454
    .line 455
    sget-object v15, Lo/t;->a:Ljava/lang/Object;

    .line 456
    .line 457
    if-eq v14, v15, :cond_15

    .line 458
    .line 459
    if-eq v13, v12, :cond_14

    .line 460
    .line 461
    aget-wide v17, v9, v13

    .line 462
    .line 463
    aput-wide v17, v9, v12

    .line 464
    .line 465
    aput-object v14, v10, v12

    .line 466
    .line 467
    aput-object v16, v10, v13

    .line 468
    .line 469
    :cond_14
    add-int/lit8 v12, v12, 0x1

    .line 470
    .line 471
    :cond_15
    add-int/lit8 v13, v13, 0x1

    .line 472
    .line 473
    goto :goto_e

    .line 474
    :cond_16
    const/4 v13, 0x0

    .line 475
    iput-boolean v13, v1, Lo/s;->a:Z

    .line 476
    .line 477
    iput v12, v1, Lo/s;->d:I

    .line 478
    .line 479
    :cond_17
    iget-object v5, v1, Lo/s;->b:[J

    .line 480
    .line 481
    iget v9, v1, Lo/s;->d:I

    .line 482
    .line 483
    invoke-static {v5, v9, v7, v8}, Lp/a;->b([JIJ)I

    .line 484
    .line 485
    .line 486
    move-result v5

    .line 487
    if-ltz v5, :cond_18

    .line 488
    .line 489
    goto :goto_10

    .line 490
    :cond_18
    iget v5, v11, Ld2/b;->b:I

    .line 491
    .line 492
    if-ge v2, v5, :cond_1a

    .line 493
    .line 494
    add-int/lit8 v5, v5, -0x1

    .line 495
    .line 496
    move v7, v2

    .line 497
    :goto_f
    if-ge v7, v5, :cond_19

    .line 498
    .line 499
    iget-object v8, v11, Ld2/b;->c:[J

    .line 500
    .line 501
    add-int/lit8 v9, v7, 0x1

    .line 502
    .line 503
    aget-wide v12, v8, v9

    .line 504
    .line 505
    aput-wide v12, v8, v7

    .line 506
    .line 507
    move v7, v9

    .line 508
    goto :goto_f

    .line 509
    :cond_19
    iget v5, v11, Ld2/b;->b:I

    .line 510
    .line 511
    add-int/2addr v5, v4

    .line 512
    iput v5, v11, Ld2/b;->b:I

    .line 513
    .line 514
    :cond_1a
    :goto_10
    add-int/lit8 v2, v2, -0x1

    .line 515
    .line 516
    goto :goto_d

    .line 517
    :cond_1b
    new-instance v1, Ljava/util/ArrayList;

    .line 518
    .line 519
    invoke-virtual {v6}, Lo/s;->i()I

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v6}, Lo/s;->i()I

    .line 527
    .line 528
    .line 529
    move-result v2

    .line 530
    const/4 v4, 0x0

    .line 531
    :goto_11
    if-ge v4, v2, :cond_1c

    .line 532
    .line 533
    invoke-virtual {v6, v4}, Lo/s;->j(I)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    add-int/lit8 v4, v4, 0x1

    .line 541
    .line 542
    goto :goto_11

    .line 543
    :cond_1c
    new-instance v2, Lc2/l;

    .line 544
    .line 545
    invoke-direct {v2, v1, v3}, Lc2/l;-><init>(Ljava/util/List;Lb7/n;)V

    .line 546
    .line 547
    .line 548
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 549
    .line 550
    .line 551
    move-result v4

    .line 552
    const/4 v5, 0x0

    .line 553
    :goto_12
    if-ge v5, v4, :cond_1e

    .line 554
    .line 555
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v6

    .line 559
    move-object v7, v6

    .line 560
    check-cast v7, Lc2/t;

    .line 561
    .line 562
    iget-wide v7, v7, Lc2/t;->a:J

    .line 563
    .line 564
    invoke-virtual {v3, v7, v8}, Lb7/n;->b(J)Z

    .line 565
    .line 566
    .line 567
    move-result v7

    .line 568
    if-eqz v7, :cond_1d

    .line 569
    .line 570
    goto :goto_13

    .line 571
    :cond_1d
    add-int/lit8 v5, v5, 0x1

    .line 572
    .line 573
    goto :goto_12

    .line 574
    :cond_1e
    move-object/from16 v6, v16

    .line 575
    .line 576
    :goto_13
    check-cast v6, Lc2/t;

    .line 577
    .line 578
    const/4 v1, 0x3

    .line 579
    if-eqz v6, :cond_2b

    .line 580
    .line 581
    iget-boolean v3, v6, Lc2/t;->d:Z

    .line 582
    .line 583
    if-nez p4, :cond_1f

    .line 584
    .line 585
    const/4 v13, 0x0

    .line 586
    iput-boolean v13, v0, Lc2/j;->i:Z

    .line 587
    .line 588
    goto :goto_18

    .line 589
    :cond_1f
    const/4 v13, 0x0

    .line 590
    iget-boolean v4, v0, Lc2/j;->i:Z

    .line 591
    .line 592
    if-nez v4, :cond_25

    .line 593
    .line 594
    if-nez v3, :cond_20

    .line 595
    .line 596
    iget-boolean v4, v6, Lc2/t;->h:Z

    .line 597
    .line 598
    if-eqz v4, :cond_25

    .line 599
    .line 600
    :cond_20
    iget-object v4, v0, Lc2/j;->f:Li2/g1;

    .line 601
    .line 602
    invoke-static {v4}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    iget-wide v4, v4, Lg2/g1;->c:J

    .line 606
    .line 607
    iget-wide v6, v6, Lc2/t;->c:J

    .line 608
    .line 609
    const/16 v8, 0x20

    .line 610
    .line 611
    shr-long v9, v6, v8

    .line 612
    .line 613
    long-to-int v10, v9

    .line 614
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 615
    .line 616
    .line 617
    move-result v9

    .line 618
    const-wide v10, 0xffffffffL

    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    and-long/2addr v6, v10

    .line 624
    long-to-int v7, v6

    .line 625
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 626
    .line 627
    .line 628
    move-result v6

    .line 629
    shr-long v7, v4, v8

    .line 630
    .line 631
    long-to-int v8, v7

    .line 632
    and-long/2addr v4, v10

    .line 633
    long-to-int v5, v4

    .line 634
    const/4 v4, 0x0

    .line 635
    cmpg-float v7, v9, v4

    .line 636
    .line 637
    if-gez v7, :cond_21

    .line 638
    .line 639
    const/4 v7, 0x1

    .line 640
    goto :goto_14

    .line 641
    :cond_21
    const/4 v7, 0x0

    .line 642
    :goto_14
    int-to-float v8, v8

    .line 643
    cmpl-float v8, v9, v8

    .line 644
    .line 645
    if-lez v8, :cond_22

    .line 646
    .line 647
    const/4 v8, 0x1

    .line 648
    goto :goto_15

    .line 649
    :cond_22
    const/4 v8, 0x0

    .line 650
    :goto_15
    or-int/2addr v7, v8

    .line 651
    cmpg-float v4, v6, v4

    .line 652
    .line 653
    if-gez v4, :cond_23

    .line 654
    .line 655
    const/4 v4, 0x1

    .line 656
    goto :goto_16

    .line 657
    :cond_23
    const/4 v4, 0x0

    .line 658
    :goto_16
    or-int/2addr v4, v7

    .line 659
    int-to-float v5, v5

    .line 660
    cmpl-float v5, v6, v5

    .line 661
    .line 662
    if-lez v5, :cond_24

    .line 663
    .line 664
    const/4 v5, 0x1

    .line 665
    goto :goto_17

    .line 666
    :cond_24
    const/4 v5, 0x0

    .line 667
    :goto_17
    or-int/2addr v4, v5

    .line 668
    xor-int/lit8 v4, v4, 0x1

    .line 669
    .line 670
    iput-boolean v4, v0, Lc2/j;->i:Z

    .line 671
    .line 672
    :cond_25
    :goto_18
    iget-boolean v4, v0, Lc2/j;->i:Z

    .line 673
    .line 674
    iget-boolean v5, v0, Lc2/j;->h:Z

    .line 675
    .line 676
    const/4 v6, 0x5

    .line 677
    const/4 v7, 0x4

    .line 678
    if-eq v4, v5, :cond_29

    .line 679
    .line 680
    iget v8, v2, Lc2/l;->e:I

    .line 681
    .line 682
    if-ne v8, v1, :cond_26

    .line 683
    .line 684
    goto :goto_19

    .line 685
    :cond_26
    if-ne v8, v7, :cond_27

    .line 686
    .line 687
    goto :goto_19

    .line 688
    :cond_27
    if-ne v8, v6, :cond_29

    .line 689
    .line 690
    :goto_19
    if-eqz v4, :cond_28

    .line 691
    .line 692
    const/4 v6, 0x4

    .line 693
    :cond_28
    iput v6, v2, Lc2/l;->e:I

    .line 694
    .line 695
    goto :goto_1a

    .line 696
    :cond_29
    iget v8, v2, Lc2/l;->e:I

    .line 697
    .line 698
    if-ne v8, v7, :cond_2a

    .line 699
    .line 700
    if-eqz v5, :cond_2a

    .line 701
    .line 702
    iget-boolean v5, v0, Lc2/j;->j:Z

    .line 703
    .line 704
    if-nez v5, :cond_2a

    .line 705
    .line 706
    iput v1, v2, Lc2/l;->e:I

    .line 707
    .line 708
    goto :goto_1a

    .line 709
    :cond_2a
    if-ne v8, v6, :cond_2c

    .line 710
    .line 711
    if-eqz v4, :cond_2c

    .line 712
    .line 713
    if-eqz v3, :cond_2c

    .line 714
    .line 715
    iput v1, v2, Lc2/l;->e:I

    .line 716
    .line 717
    goto :goto_1a

    .line 718
    :cond_2b
    const/4 v13, 0x0

    .line 719
    :cond_2c
    :goto_1a
    if-nez v49, :cond_30

    .line 720
    .line 721
    iget v3, v2, Lc2/l;->e:I

    .line 722
    .line 723
    if-ne v3, v1, :cond_30

    .line 724
    .line 725
    iget-object v1, v0, Lc2/j;->g:Lc2/l;

    .line 726
    .line 727
    if-eqz v1, :cond_30

    .line 728
    .line 729
    iget-object v1, v1, Lc2/l;->a:Ljava/lang/Object;

    .line 730
    .line 731
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 732
    .line 733
    .line 734
    move-result v3

    .line 735
    iget-object v4, v2, Lc2/l;->a:Ljava/lang/Object;

    .line 736
    .line 737
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 738
    .line 739
    .line 740
    move-result v5

    .line 741
    if-eq v3, v5, :cond_2d

    .line 742
    .line 743
    goto :goto_1c

    .line 744
    :cond_2d
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    const/4 v5, 0x0

    .line 749
    :goto_1b
    if-ge v5, v3, :cond_2f

    .line 750
    .line 751
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v6

    .line 755
    check-cast v6, Lc2/t;

    .line 756
    .line 757
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v7

    .line 761
    check-cast v7, Lc2/t;

    .line 762
    .line 763
    iget-wide v8, v6, Lc2/t;->c:J

    .line 764
    .line 765
    iget-wide v6, v7, Lc2/t;->c:J

    .line 766
    .line 767
    invoke-static {v8, v9, v6, v7}, Lp1/b;->c(JJ)Z

    .line 768
    .line 769
    .line 770
    move-result v6

    .line 771
    if-nez v6, :cond_2e

    .line 772
    .line 773
    goto :goto_1c

    .line 774
    :cond_2e
    add-int/lit8 v5, v5, 0x1

    .line 775
    .line 776
    goto :goto_1b

    .line 777
    :cond_2f
    const/4 v7, 0x0

    .line 778
    goto :goto_1d

    .line 779
    :cond_30
    :goto_1c
    const/4 v7, 0x1

    .line 780
    :goto_1d
    iput-object v2, v0, Lc2/j;->g:Lc2/l;

    .line 781
    .line 782
    return v7
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
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
    .line 913
    .line 914
    .line 915
    .line 916
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
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
.end method

.method public final b(Lb7/n;)V
    .locals 10

    .line 1
    invoke-super {p0, p1}, Lc2/k;->b(Lb7/n;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lc2/j;->g:Lc2/l;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean v1, p0, Lc2/j;->i:Z

    .line 10
    .line 11
    iput-boolean v1, p0, Lc2/j;->h:Z

    .line 12
    .line 13
    iget-object v1, v0, Lc2/l;->a:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, Ljava/util/Collection;

    .line 17
    .line 18
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    if-ge v4, v2, :cond_4

    .line 25
    .line 26
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lc2/t;

    .line 31
    .line 32
    iget-boolean v6, v5, Lc2/t;->d:Z

    .line 33
    .line 34
    iget-wide v7, v5, Lc2/t;->a:J

    .line 35
    .line 36
    invoke-virtual {p1, v7, v8}, Lb7/n;->b(J)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    iget-boolean v9, p0, Lc2/j;->i:Z

    .line 41
    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    :cond_1
    if-nez v6, :cond_3

    .line 47
    .line 48
    if-nez v9, :cond_3

    .line 49
    .line 50
    :cond_2
    iget-object v5, p0, Lc2/j;->d:Ld2/b;

    .line 51
    .line 52
    invoke-virtual {v5, v7, v8}, Ld2/b;->e(J)V

    .line 53
    .line 54
    .line 55
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    iput-boolean v3, p0, Lc2/j;->i:Z

    .line 59
    .line 60
    iget p1, v0, Lc2/l;->e:I

    .line 61
    .line 62
    const/4 v0, 0x5

    .line 63
    if-ne p1, v0, :cond_5

    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    :cond_5
    iput-boolean v3, p0, Lc2/j;->j:Z

    .line 67
    .line 68
    return-void
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final c()V
    .locals 9

    .line 1
    iget-object v0, p0, Lc2/k;->a:Lz0/e;

    .line 2
    .line 3
    iget-object v1, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v0, v0, Lz0/e;->c:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v0, :cond_0

    .line 10
    .line 11
    aget-object v4, v1, v3

    .line 12
    .line 13
    check-cast v4, Lc2/j;

    .line 14
    .line 15
    invoke-virtual {v4}, Lc2/j;->c()V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    iget-object v1, p0, Lc2/j;->c:Lj1/p;

    .line 23
    .line 24
    move-object v3, v0

    .line 25
    :goto_1
    if-eqz v1, :cond_8

    .line 26
    .line 27
    instance-of v4, v1, Li2/u1;

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    check-cast v1, Li2/u1;

    .line 32
    .line 33
    invoke-interface {v1}, Li2/u1;->z()V

    .line 34
    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    iget v4, v1, Lj1/p;->c:I

    .line 38
    .line 39
    const/16 v5, 0x10

    .line 40
    .line 41
    and-int/2addr v4, v5

    .line 42
    if-eqz v4, :cond_7

    .line 43
    .line 44
    instance-of v4, v1, Li2/n;

    .line 45
    .line 46
    if-eqz v4, :cond_7

    .line 47
    .line 48
    move-object v4, v1

    .line 49
    check-cast v4, Li2/n;

    .line 50
    .line 51
    iget-object v4, v4, Li2/n;->p:Lj1/p;

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    :goto_2
    const/4 v7, 0x1

    .line 55
    if-eqz v4, :cond_6

    .line 56
    .line 57
    iget v8, v4, Lj1/p;->c:I

    .line 58
    .line 59
    and-int/2addr v8, v5

    .line 60
    if-eqz v8, :cond_5

    .line 61
    .line 62
    add-int/lit8 v6, v6, 0x1

    .line 63
    .line 64
    if-ne v6, v7, :cond_2

    .line 65
    .line 66
    move-object v1, v4

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    if-nez v3, :cond_3

    .line 69
    .line 70
    new-instance v3, Lz0/e;

    .line 71
    .line 72
    new-array v7, v5, [Lj1/p;

    .line 73
    .line 74
    invoke-direct {v3, v7}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    if-eqz v1, :cond_4

    .line 78
    .line 79
    invoke-virtual {v3, v1}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-object v1, v0

    .line 83
    :cond_4
    invoke-virtual {v3, v4}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    :goto_3
    iget-object v4, v4, Lj1/p;->f:Lj1/p;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_6
    if-ne v6, v7, :cond_7

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_7
    :goto_4
    invoke-static {v3}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    goto :goto_1

    .line 97
    :cond_8
    return-void
    .line 98
.end method

.method public final d(Lb7/n;)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lc2/j;->e:Lo/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo/s;->i()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lc2/j;->c:Lj1/p;

    .line 14
    .line 15
    iget-boolean v4, v1, Lj1/p;->n:Z

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_1
    iget-object v4, p0, Lc2/j;->g:Lc2/l;

    .line 22
    .line 23
    invoke-static {v4}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v5, p0, Lc2/j;->f:Li2/g1;

    .line 27
    .line 28
    invoke-static {v5}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-wide v5, v5, Lg2/g1;->c:J

    .line 32
    .line 33
    move-object v7, v1

    .line 34
    move-object v8, v2

    .line 35
    :goto_0
    const/4 v9, 0x1

    .line 36
    if-eqz v7, :cond_9

    .line 37
    .line 38
    instance-of v10, v7, Li2/u1;

    .line 39
    .line 40
    if-eqz v10, :cond_2

    .line 41
    .line 42
    check-cast v7, Li2/u1;

    .line 43
    .line 44
    sget-object v9, Lc2/m;->c:Lc2/m;

    .line 45
    .line 46
    invoke-interface {v7, v4, v9, v5, v6}, Li2/u1;->j(Lc2/l;Lc2/m;J)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_2
    iget v10, v7, Lj1/p;->c:I

    .line 51
    .line 52
    const/16 v11, 0x10

    .line 53
    .line 54
    and-int/2addr v10, v11

    .line 55
    if-eqz v10, :cond_8

    .line 56
    .line 57
    instance-of v10, v7, Li2/n;

    .line 58
    .line 59
    if-eqz v10, :cond_8

    .line 60
    .line 61
    move-object v10, v7

    .line 62
    check-cast v10, Li2/n;

    .line 63
    .line 64
    iget-object v10, v10, Li2/n;->p:Lj1/p;

    .line 65
    .line 66
    const/4 v12, 0x0

    .line 67
    :goto_1
    if-eqz v10, :cond_7

    .line 68
    .line 69
    iget v13, v10, Lj1/p;->c:I

    .line 70
    .line 71
    and-int/2addr v13, v11

    .line 72
    if-eqz v13, :cond_6

    .line 73
    .line 74
    add-int/lit8 v12, v12, 0x1

    .line 75
    .line 76
    if-ne v12, v9, :cond_3

    .line 77
    .line 78
    move-object v7, v10

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    if-nez v8, :cond_4

    .line 81
    .line 82
    new-instance v8, Lz0/e;

    .line 83
    .line 84
    new-array v13, v11, [Lj1/p;

    .line 85
    .line 86
    invoke-direct {v8, v13}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_4
    if-eqz v7, :cond_5

    .line 90
    .line 91
    invoke-virtual {v8, v7}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    move-object v7, v2

    .line 95
    :cond_5
    invoke-virtual {v8, v10}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_6
    :goto_2
    iget-object v10, v10, Lj1/p;->f:Lj1/p;

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_7
    if-ne v12, v9, :cond_8

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_8
    :goto_3
    invoke-static {v8}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    goto :goto_0

    .line 109
    :cond_9
    iget-boolean v1, v1, Lj1/p;->n:Z

    .line 110
    .line 111
    if-eqz v1, :cond_a

    .line 112
    .line 113
    iget-object v1, p0, Lc2/k;->a:Lz0/e;

    .line 114
    .line 115
    iget-object v4, v1, Lz0/e;->a:[Ljava/lang/Object;

    .line 116
    .line 117
    iget v1, v1, Lz0/e;->c:I

    .line 118
    .line 119
    :goto_4
    if-ge v3, v1, :cond_a

    .line 120
    .line 121
    aget-object v5, v4, v3

    .line 122
    .line 123
    check-cast v5, Lc2/j;

    .line 124
    .line 125
    invoke-virtual {v5, p1}, Lc2/j;->d(Lb7/n;)Z

    .line 126
    .line 127
    .line 128
    add-int/lit8 v3, v3, 0x1

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_a
    const/4 v3, 0x1

    .line 132
    :goto_5
    invoke-virtual {p0, p1}, Lc2/j;->b(Lb7/n;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Lo/s;->b()V

    .line 136
    .line 137
    .line 138
    iput-object v2, p0, Lc2/j;->f:Li2/g1;

    .line 139
    .line 140
    return v3
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public final e(Lb7/n;Z)Z
    .locals 13

    .line 1
    iget-object v0, p0, Lc2/j;->e:Lo/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo/s;->i()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lc2/j;->c:Lj1/p;

    .line 12
    .line 13
    iget-boolean v2, v0, Lj1/p;->n:Z

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    iget-object v2, p0, Lc2/j;->g:Lc2/l;

    .line 19
    .line 20
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lc2/j;->f:Li2/g1;

    .line 24
    .line 25
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-wide v3, v3, Lg2/g1;->c:J

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    move-object v6, v0

    .line 32
    move-object v7, v5

    .line 33
    :goto_0
    const/16 v8, 0x10

    .line 34
    .line 35
    const/4 v9, 0x1

    .line 36
    if-eqz v6, :cond_9

    .line 37
    .line 38
    instance-of v10, v6, Li2/u1;

    .line 39
    .line 40
    if-eqz v10, :cond_2

    .line 41
    .line 42
    check-cast v6, Li2/u1;

    .line 43
    .line 44
    sget-object v8, Lc2/m;->a:Lc2/m;

    .line 45
    .line 46
    invoke-interface {v6, v2, v8, v3, v4}, Li2/u1;->j(Lc2/l;Lc2/m;J)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_2
    iget v10, v6, Lj1/p;->c:I

    .line 51
    .line 52
    and-int/2addr v10, v8

    .line 53
    if-eqz v10, :cond_8

    .line 54
    .line 55
    instance-of v10, v6, Li2/n;

    .line 56
    .line 57
    if-eqz v10, :cond_8

    .line 58
    .line 59
    move-object v10, v6

    .line 60
    check-cast v10, Li2/n;

    .line 61
    .line 62
    iget-object v10, v10, Li2/n;->p:Lj1/p;

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    :goto_1
    if-eqz v10, :cond_7

    .line 66
    .line 67
    iget v12, v10, Lj1/p;->c:I

    .line 68
    .line 69
    and-int/2addr v12, v8

    .line 70
    if-eqz v12, :cond_6

    .line 71
    .line 72
    add-int/lit8 v11, v11, 0x1

    .line 73
    .line 74
    if-ne v11, v9, :cond_3

    .line 75
    .line 76
    move-object v6, v10

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    if-nez v7, :cond_4

    .line 79
    .line 80
    new-instance v7, Lz0/e;

    .line 81
    .line 82
    new-array v12, v8, [Lj1/p;

    .line 83
    .line 84
    invoke-direct {v7, v12}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    if-eqz v6, :cond_5

    .line 88
    .line 89
    invoke-virtual {v7, v6}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    move-object v6, v5

    .line 93
    :cond_5
    invoke-virtual {v7, v10}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_6
    :goto_2
    iget-object v10, v10, Lj1/p;->f:Lj1/p;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_7
    if-ne v11, v9, :cond_8

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_8
    :goto_3
    invoke-static {v7}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    goto :goto_0

    .line 107
    :cond_9
    iget-boolean v6, v0, Lj1/p;->n:Z

    .line 108
    .line 109
    if-eqz v6, :cond_a

    .line 110
    .line 111
    iget-object v6, p0, Lc2/k;->a:Lz0/e;

    .line 112
    .line 113
    iget-object v7, v6, Lz0/e;->a:[Ljava/lang/Object;

    .line 114
    .line 115
    iget v6, v6, Lz0/e;->c:I

    .line 116
    .line 117
    const/4 v10, 0x0

    .line 118
    :goto_4
    if-ge v10, v6, :cond_a

    .line 119
    .line 120
    aget-object v11, v7, v10

    .line 121
    .line 122
    check-cast v11, Lc2/j;

    .line 123
    .line 124
    iget-object v12, p0, Lc2/j;->f:Li2/g1;

    .line 125
    .line 126
    invoke-static {v12}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11, p1, p2}, Lc2/j;->e(Lb7/n;Z)Z

    .line 130
    .line 131
    .line 132
    add-int/lit8 v10, v10, 0x1

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_a
    iget-boolean p1, v0, Lj1/p;->n:Z

    .line 136
    .line 137
    if-eqz p1, :cond_12

    .line 138
    .line 139
    move-object p1, v5

    .line 140
    :goto_5
    if-eqz v0, :cond_12

    .line 141
    .line 142
    instance-of p2, v0, Li2/u1;

    .line 143
    .line 144
    if-eqz p2, :cond_b

    .line 145
    .line 146
    check-cast v0, Li2/u1;

    .line 147
    .line 148
    sget-object p2, Lc2/m;->b:Lc2/m;

    .line 149
    .line 150
    invoke-interface {v0, v2, p2, v3, v4}, Li2/u1;->j(Lc2/l;Lc2/m;J)V

    .line 151
    .line 152
    .line 153
    goto :goto_8

    .line 154
    :cond_b
    iget p2, v0, Lj1/p;->c:I

    .line 155
    .line 156
    and-int/2addr p2, v8

    .line 157
    if-eqz p2, :cond_11

    .line 158
    .line 159
    instance-of p2, v0, Li2/n;

    .line 160
    .line 161
    if-eqz p2, :cond_11

    .line 162
    .line 163
    move-object p2, v0

    .line 164
    check-cast p2, Li2/n;

    .line 165
    .line 166
    iget-object p2, p2, Li2/n;->p:Lj1/p;

    .line 167
    .line 168
    const/4 v6, 0x0

    .line 169
    :goto_6
    if-eqz p2, :cond_10

    .line 170
    .line 171
    iget v7, p2, Lj1/p;->c:I

    .line 172
    .line 173
    and-int/2addr v7, v8

    .line 174
    if-eqz v7, :cond_f

    .line 175
    .line 176
    add-int/lit8 v6, v6, 0x1

    .line 177
    .line 178
    if-ne v6, v9, :cond_c

    .line 179
    .line 180
    move-object v0, p2

    .line 181
    goto :goto_7

    .line 182
    :cond_c
    if-nez p1, :cond_d

    .line 183
    .line 184
    new-instance p1, Lz0/e;

    .line 185
    .line 186
    new-array v7, v8, [Lj1/p;

    .line 187
    .line 188
    invoke-direct {p1, v7}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_d
    if-eqz v0, :cond_e

    .line 192
    .line 193
    invoke-virtual {p1, v0}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    move-object v0, v5

    .line 197
    :cond_e
    invoke-virtual {p1, p2}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_f
    :goto_7
    iget-object p2, p2, Lj1/p;->f:Lj1/p;

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_10
    if-ne v6, v9, :cond_11

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_11
    :goto_8
    invoke-static {p1}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    goto :goto_5

    .line 211
    :cond_12
    return v9
    .line 212
    .line 213
    .line 214
.end method

.method public final f(JLo/g0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc2/j;->d:Ld2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ld2/b;->c(J)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p3, p0}, Lo/g0;->f(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ltz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0, p1, p2}, Ld2/b;->e(J)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lc2/j;->e:Lo/s;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Lo/s;->h(J)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    iget-object v0, p0, Lc2/k;->a:Lz0/e;

    .line 25
    .line 26
    iget-object v1, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 27
    .line 28
    iget v0, v0, Lz0/e;->c:I

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    :goto_1
    if-ge v2, v0, :cond_2

    .line 32
    .line 33
    aget-object v3, v1, v2

    .line 34
    .line 35
    check-cast v3, Lc2/j;

    .line 36
    .line 37
    invoke-virtual {v3, p1, p2, p3}, Lc2/j;->f(JLo/g0;)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    return-void
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Node(modifierNode="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lc2/j;->c:Lj1/p;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", children="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lc2/k;->a:Lz0/e;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", pointerIds="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lc2/j;->d:Ld2/b;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 v1, 0x29

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method
