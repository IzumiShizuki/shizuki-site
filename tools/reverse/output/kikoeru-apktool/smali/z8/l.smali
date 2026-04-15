.class public abstract Lz8/l;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final synthetic a:[Lpc/u;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljc/n;

    .line 2
    .line 3
    const-string v1, "realStore"

    .line 4
    .line 5
    const-string v2, "<v#0>"

    .line 6
    .line 7
    const-class v3, Lz8/l;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Ljc/n;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Ljc/z;->a:Ljc/a0;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljc/a0;->d(Ljc/n;)Lpc/i;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    new-array v1, v1, [Lpc/u;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aput-object v0, v1, v2

    .line 23
    .line 24
    sput-object v1, Lz8/l;->a:[Lpc/u;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Lj1/q;FLic/k;Loc/a;ZLic/k;JZLx0/o;II)V
    .locals 45

    .line 1
    move-object/from16 v8, p11

    .line 2
    .line 3
    move/from16 v14, p12

    .line 4
    .line 5
    move/from16 v15, p13

    .line 6
    .line 7
    const v0, -0x34cf84ec    # -1.1565844E7f

    .line 8
    .line 9
    .line 10
    invoke-virtual {v8, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p1

    .line 14
    .line 15
    invoke-virtual {v8, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/16 v0, 0x20

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 v0, 0x10

    .line 25
    .line 26
    :goto_0
    or-int/2addr v0, v14

    .line 27
    or-int/lit16 v3, v0, 0x180

    .line 28
    .line 29
    and-int/lit8 v4, v15, 0x10

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    or-int/lit16 v3, v0, 0x6180

    .line 34
    .line 35
    :cond_1
    move-object/from16 v0, p4

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    and-int/lit16 v0, v14, 0x6000

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    move-object/from16 v0, p4

    .line 43
    .line 44
    invoke-virtual {v8, v0}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_3

    .line 49
    .line 50
    const/16 v6, 0x4000

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    const/16 v6, 0x2000

    .line 54
    .line 55
    :goto_1
    or-int/2addr v3, v6

    .line 56
    :goto_2
    and-int/lit8 v6, v15, 0x20

    .line 57
    .line 58
    if-nez v6, :cond_4

    .line 59
    .line 60
    move-object/from16 v6, p5

    .line 61
    .line 62
    invoke-virtual {v8, v6}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_5

    .line 67
    .line 68
    const/high16 v7, 0x20000

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    move-object/from16 v6, p5

    .line 72
    .line 73
    :cond_5
    const/high16 v7, 0x10000

    .line 74
    .line 75
    :goto_3
    or-int/2addr v3, v7

    .line 76
    const/high16 v7, 0x16c00000

    .line 77
    .line 78
    or-int/2addr v3, v7

    .line 79
    and-int/lit16 v7, v15, 0x400

    .line 80
    .line 81
    const/4 v10, 0x6

    .line 82
    move/from16 v11, p10

    .line 83
    .line 84
    if-eqz v7, :cond_6

    .line 85
    .line 86
    const/4 v12, 0x6

    .line 87
    goto :goto_4

    .line 88
    :cond_6
    invoke-virtual {v8, v11}, Lx0/o;->g(Z)Z

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    if-eqz v12, :cond_7

    .line 93
    .line 94
    const/4 v12, 0x4

    .line 95
    goto :goto_4

    .line 96
    :cond_7
    const/4 v12, 0x2

    .line 97
    :goto_4
    or-int/lit8 v16, v12, 0x30

    .line 98
    .line 99
    const v12, 0x12492493

    .line 100
    .line 101
    .line 102
    and-int/2addr v12, v3

    .line 103
    const v13, 0x12492492

    .line 104
    .line 105
    .line 106
    if-ne v12, v13, :cond_9

    .line 107
    .line 108
    and-int/lit8 v12, v16, 0x13

    .line 109
    .line 110
    const/16 v13, 0x12

    .line 111
    .line 112
    if-eq v12, v13, :cond_8

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_8
    const/4 v12, 0x0

    .line 116
    goto :goto_6

    .line 117
    :cond_9
    :goto_5
    const/4 v12, 0x1

    .line 118
    :goto_6
    and-int/lit8 v13, v3, 0x1

    .line 119
    .line 120
    invoke-virtual {v8, v13, v12}, Lx0/o;->N(IZ)Z

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    if-eqz v12, :cond_26

    .line 125
    .line 126
    invoke-virtual {v8}, Lx0/o;->S()V

    .line 127
    .line 128
    .line 129
    and-int/lit8 v12, p12, 0x1

    .line 130
    .line 131
    sget-object v13, Lx0/k;->a:Lx0/r0;

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    sget-object v15, Lj1/n;->a:Lj1/n;

    .line 136
    .line 137
    const v18, -0x70000001

    .line 138
    .line 139
    .line 140
    const v19, -0x70001

    .line 141
    .line 142
    .line 143
    const/high16 v14, 0x3f800000    # 1.0f

    .line 144
    .line 145
    if-eqz v12, :cond_c

    .line 146
    .line 147
    invoke-virtual {v8}, Lx0/o;->x()Z

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    if-eqz v12, :cond_a

    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_a
    invoke-virtual {v8}, Lx0/o;->Q()V

    .line 155
    .line 156
    .line 157
    and-int/lit8 v4, p13, 0x20

    .line 158
    .line 159
    if-eqz v4, :cond_b

    .line 160
    .line 161
    and-int v3, v3, v19

    .line 162
    .line 163
    :cond_b
    and-int v3, v3, v18

    .line 164
    .line 165
    move-wide/from16 v21, p8

    .line 166
    .line 167
    move/from16 v19, v3

    .line 168
    .line 169
    move-object/from16 v18, v6

    .line 170
    .line 171
    move-object/from16 v6, p7

    .line 172
    .line 173
    move-object v3, v0

    .line 174
    move-object/from16 v0, p2

    .line 175
    .line 176
    goto :goto_9

    .line 177
    :cond_c
    :goto_7
    if-eqz v4, :cond_d

    .line 178
    .line 179
    const/4 v0, 0x0

    .line 180
    :cond_d
    and-int/lit8 v4, p13, 0x20

    .line 181
    .line 182
    if-eqz v4, :cond_e

    .line 183
    .line 184
    new-instance v4, Loc/a;

    .line 185
    .line 186
    const/4 v6, 0x0

    .line 187
    invoke-direct {v4, v6, v14}, Loc/a;-><init>(FF)V

    .line 188
    .line 189
    .line 190
    and-int v3, v3, v19

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_e
    move-object v4, v6

    .line 194
    :goto_8
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    if-ne v6, v13, :cond_f

    .line 199
    .line 200
    new-instance v6, Ly9/c;

    .line 201
    .line 202
    const/4 v12, 0x4

    .line 203
    invoke-direct {v6, v12}, Ly9/c;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_f
    check-cast v6, Lic/k;

    .line 210
    .line 211
    sget-object v12, Lm0/c1;->a:Lx0/o2;

    .line 212
    .line 213
    invoke-virtual {v8, v12}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    check-cast v12, Lm0/b1;

    .line 218
    .line 219
    invoke-virtual {v12}, Lm0/b1;->c()J

    .line 220
    .line 221
    .line 222
    move-result-wide v21

    .line 223
    and-int v3, v3, v18

    .line 224
    .line 225
    if-eqz v7, :cond_10

    .line 226
    .line 227
    const/4 v11, 0x1

    .line 228
    :cond_10
    move/from16 v19, v3

    .line 229
    .line 230
    move-object/from16 v18, v4

    .line 231
    .line 232
    move-object v3, v0

    .line 233
    move-object v0, v15

    .line 234
    :goto_9
    invoke-virtual {v8}, Lx0/o;->q()V

    .line 235
    .line 236
    .line 237
    invoke-static {}, Ly8/c;->e()Lx0/m1;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-virtual {v8, v4}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    check-cast v4, Lhg/a;

    .line 246
    .line 247
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    if-ne v7, v13, :cond_11

    .line 252
    .line 253
    invoke-static/range {p3 .. p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    sget-object v12, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 258
    .line 259
    invoke-static {v12}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 260
    .line 261
    .line 262
    move-result-object v12

    .line 263
    move-object/from16 v14, p0

    .line 264
    .line 265
    invoke-static {v4, v14, v7, v12}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    invoke-virtual {v8, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_11
    move-object/from16 v14, p0

    .line 274
    .line 275
    :goto_a
    move-object v4, v7

    .line 276
    check-cast v4, Lhg/b;

    .line 277
    .line 278
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    if-ne v7, v13, :cond_12

    .line 283
    .line 284
    sget-object v7, Lz8/l;->a:[Lpc/u;

    .line 285
    .line 286
    aget-object v7, v7, v17

    .line 287
    .line 288
    invoke-static {v4, v7}, Lpc/f0;->G(Lhg/b;Lpc/u;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    check-cast v7, Ljava/lang/Number;

    .line 293
    .line 294
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    invoke-static {v7}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-virtual {v8, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    :cond_12
    check-cast v7, Lx0/w0;

    .line 310
    .line 311
    sget-object v12, Ly/k;->d:Ly/e;

    .line 312
    .line 313
    sget-object v1, Lj1/c;->m:Lj1/f;

    .line 314
    .line 315
    invoke-static {v12, v1, v8, v10}, Ly/u;->a(Ly/h;Lj1/f;Lx0/o;I)Ly/v;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-static {v8}, Lx0/v;->q(Lx0/o;)I

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    invoke-virtual {v8}, Lx0/o;->l()Lx0/j1;

    .line 324
    .line 325
    .line 326
    move-result-object v12

    .line 327
    invoke-static {v15, v8}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    sget-object v26, Li2/k;->g0:Li2/j;

    .line 332
    .line 333
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    sget-object v2, Li2/j;->b:Li2/i;

    .line 337
    .line 338
    invoke-virtual {v8}, Lx0/o;->a0()V

    .line 339
    .line 340
    .line 341
    iget-boolean v9, v8, Lx0/o;->S:Z

    .line 342
    .line 343
    if-eqz v9, :cond_13

    .line 344
    .line 345
    invoke-virtual {v8, v2}, Lx0/o;->k(Lic/a;)V

    .line 346
    .line 347
    .line 348
    goto :goto_b

    .line 349
    :cond_13
    invoke-virtual {v8}, Lx0/o;->k0()V

    .line 350
    .line 351
    .line 352
    :goto_b
    sget-object v9, Li2/j;->g:Li2/h;

    .line 353
    .line 354
    invoke-static {v9, v1, v8}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 355
    .line 356
    .line 357
    sget-object v1, Li2/j;->f:Li2/h;

    .line 358
    .line 359
    invoke-static {v1, v12, v8}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 360
    .line 361
    .line 362
    sget-object v12, Li2/j;->j:Li2/h;

    .line 363
    .line 364
    move-object/from16 p2, v0

    .line 365
    .line 366
    iget-boolean v0, v8, Lx0/o;->S:Z

    .line 367
    .line 368
    if-nez v0, :cond_14

    .line 369
    .line 370
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    move-object/from16 p4, v1

    .line 375
    .line 376
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-static {v0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-nez v0, :cond_15

    .line 385
    .line 386
    goto :goto_c

    .line 387
    :cond_14
    move-object/from16 p4, v1

    .line 388
    .line 389
    :goto_c
    invoke-static {v10, v8, v10, v12}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 390
    .line 391
    .line 392
    :cond_15
    sget-object v0, Li2/j;->d:Li2/h;

    .line 393
    .line 394
    invoke-static {v0, v5, v8}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 395
    .line 396
    .line 397
    shr-int/lit8 v27, v19, 0x3

    .line 398
    .line 399
    and-int/lit8 v1, v27, 0xe

    .line 400
    .line 401
    or-int/lit16 v1, v1, 0x6030

    .line 402
    .line 403
    shl-int/lit8 v5, v16, 0x15

    .line 404
    .line 405
    const/high16 v10, 0x1c00000

    .line 406
    .line 407
    and-int/2addr v5, v10

    .line 408
    or-int/2addr v1, v5

    .line 409
    const/high16 v5, 0x6000000

    .line 410
    .line 411
    or-int/2addr v1, v5

    .line 412
    move-object v5, v13

    .line 413
    const/16 v13, 0x22c

    .line 414
    .line 415
    move-object v10, v2

    .line 416
    const/4 v2, 0x0

    .line 417
    move-object/from16 v28, v3

    .line 418
    .line 419
    const/4 v3, 0x0

    .line 420
    move-object/from16 v29, v4

    .line 421
    .line 422
    const/4 v4, 0x1

    .line 423
    move-object/from16 v30, v5

    .line 424
    .line 425
    const/4 v5, 0x0

    .line 426
    move-object/from16 v31, v9

    .line 427
    .line 428
    const/4 v9, 0x0

    .line 429
    move-object/from16 v32, v10

    .line 430
    .line 431
    const/4 v10, 0x0

    .line 432
    move v14, v11

    .line 433
    move-object v11, v8

    .line 434
    move v8, v14

    .line 435
    move-object/from16 v35, p4

    .line 436
    .line 437
    move-object/from16 v37, v0

    .line 438
    .line 439
    move-object/from16 v33, v6

    .line 440
    .line 441
    move-object/from16 v36, v12

    .line 442
    .line 443
    move-object/from16 v38, v30

    .line 444
    .line 445
    move-object/from16 v34, v31

    .line 446
    .line 447
    move-object/from16 v14, v32

    .line 448
    .line 449
    move-object/from16 v0, p1

    .line 450
    .line 451
    move v12, v1

    .line 452
    move-object/from16 v1, p2

    .line 453
    .line 454
    move-object/from16 p2, v7

    .line 455
    .line 456
    move-wide/from16 v6, v21

    .line 457
    .line 458
    invoke-static/range {v0 .. v13}, Lz8/a;->a(Ljava/lang/String;Lj1/q;Ljava/lang/String;ZZLic/a;JZLic/n;Lic/n;Lx0/o;II)V

    .line 459
    .line 460
    .line 461
    move-object/from16 v23, v1

    .line 462
    .line 463
    move v3, v8

    .line 464
    move-object v8, v11

    .line 465
    const/high16 v13, 0x3f800000    # 1.0f

    .line 466
    .line 467
    move-wide v11, v6

    .line 468
    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/c;->c(Lj1/q;F)Lj1/q;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    sget-object v1, Lj1/c;->k:Lj1/g;

    .line 473
    .line 474
    sget-object v2, Ly/k;->f:Ly/e;

    .line 475
    .line 476
    const/16 v4, 0x36

    .line 477
    .line 478
    invoke-static {v2, v1, v8, v4}, Ly/i1;->a(Ly/f;Lj1/g;Lx0/o;I)Ly/j1;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    invoke-static {v8}, Lx0/v;->q(Lx0/o;)I

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    invoke-virtual {v8}, Lx0/o;->l()Lx0/j1;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    invoke-static {v0, v8}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v8}, Lx0/o;->a0()V

    .line 495
    .line 496
    .line 497
    iget-boolean v5, v8, Lx0/o;->S:Z

    .line 498
    .line 499
    if-eqz v5, :cond_16

    .line 500
    .line 501
    invoke-virtual {v8, v14}, Lx0/o;->k(Lic/a;)V

    .line 502
    .line 503
    .line 504
    :goto_d
    move-object/from16 v5, v34

    .line 505
    .line 506
    goto :goto_e

    .line 507
    :cond_16
    invoke-virtual {v8}, Lx0/o;->k0()V

    .line 508
    .line 509
    .line 510
    goto :goto_d

    .line 511
    :goto_e
    invoke-static {v5, v1, v8}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 512
    .line 513
    .line 514
    move-object/from16 v1, v35

    .line 515
    .line 516
    invoke-static {v1, v4, v8}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 517
    .line 518
    .line 519
    iget-boolean v1, v8, Lx0/o;->S:Z

    .line 520
    .line 521
    if-nez v1, :cond_17

    .line 522
    .line 523
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 528
    .line 529
    .line 530
    move-result-object v4

    .line 531
    invoke-static {v1, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    if-nez v1, :cond_18

    .line 536
    .line 537
    :cond_17
    move-object/from16 v1, v36

    .line 538
    .line 539
    goto :goto_10

    .line 540
    :cond_18
    :goto_f
    move-object/from16 v1, v37

    .line 541
    .line 542
    goto :goto_11

    .line 543
    :goto_10
    invoke-static {v2, v8, v2, v1}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 544
    .line 545
    .line 546
    goto :goto_f

    .line 547
    :goto_11
    invoke-static {v1, v0, v8}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 548
    .line 549
    .line 550
    invoke-interface/range {p2 .. p2}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    check-cast v0, Ljava/lang/Number;

    .line 555
    .line 556
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 557
    .line 558
    .line 559
    move-result v0

    .line 560
    const v1, 0x40066666    # 2.1f

    .line 561
    .line 562
    .line 563
    float-to-double v4, v1

    .line 564
    const-string v14, "invalid weight; must be greater than zero"

    .line 565
    .line 566
    const-wide/16 v21, 0x0

    .line 567
    .line 568
    cmpl-double v2, v4, v21

    .line 569
    .line 570
    if-lez v2, :cond_19

    .line 571
    .line 572
    goto :goto_12

    .line 573
    :cond_19
    invoke-static {v14}, Lz/a;->a(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    :goto_12
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    .line 577
    .line 578
    const v15, 0x7f7fffff    # Float.MAX_VALUE

    .line 579
    .line 580
    .line 581
    cmpl-float v4, v1, v15

    .line 582
    .line 583
    if-lez v4, :cond_1a

    .line 584
    .line 585
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 586
    .line 587
    .line 588
    :cond_1a
    const/4 v4, 0x1

    .line 589
    invoke-direct {v2, v1, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    .line 590
    .line 591
    .line 592
    const/16 v1, 0x10

    .line 593
    .line 594
    int-to-float v1, v1

    .line 595
    const/16 v43, 0x0

    .line 596
    .line 597
    const/16 v44, 0xa

    .line 598
    .line 599
    const/16 v41, 0x0

    .line 600
    .line 601
    move/from16 v42, v1

    .line 602
    .line 603
    move/from16 v40, v1

    .line 604
    .line 605
    move-object/from16 v39, v2

    .line 606
    .line 607
    invoke-static/range {v39 .. v44}, Landroidx/compose/foundation/layout/a;->n(Lj1/q;FFFFI)Lj1/q;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    move-object/from16 v5, v38

    .line 616
    .line 617
    if-ne v1, v5, :cond_1b

    .line 618
    .line 619
    new-instance v1, Lw9/c;

    .line 620
    .line 621
    const/4 v4, 0x3

    .line 622
    move-object/from16 v6, p2

    .line 623
    .line 624
    invoke-direct {v1, v6, v4}, Lw9/c;-><init>(Lx0/w0;I)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v8, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    goto :goto_13

    .line 631
    :cond_1b
    move-object/from16 v6, p2

    .line 632
    .line 633
    :goto_13
    check-cast v1, Lic/k;

    .line 634
    .line 635
    move-object/from16 v7, v29

    .line 636
    .line 637
    invoke-virtual {v8, v7}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v4

    .line 641
    const v9, 0xe000

    .line 642
    .line 643
    .line 644
    and-int v10, v19, v9

    .line 645
    .line 646
    const p2, 0xe000

    .line 647
    .line 648
    .line 649
    const/16 v9, 0x4000

    .line 650
    .line 651
    if-ne v10, v9, :cond_1c

    .line 652
    .line 653
    const/4 v9, 0x1

    .line 654
    goto :goto_14

    .line 655
    :cond_1c
    const/4 v9, 0x0

    .line 656
    :goto_14
    or-int/2addr v4, v9

    .line 657
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v9

    .line 661
    if-nez v4, :cond_1e

    .line 662
    .line 663
    if-ne v9, v5, :cond_1d

    .line 664
    .line 665
    goto :goto_15

    .line 666
    :cond_1d
    move-object/from16 v4, v28

    .line 667
    .line 668
    goto :goto_16

    .line 669
    :cond_1e
    :goto_15
    new-instance v9, Lz8/j;

    .line 670
    .line 671
    move-object/from16 v4, v28

    .line 672
    .line 673
    invoke-direct {v9, v4, v6, v7}, Lz8/j;-><init>(Lic/k;Lx0/w0;Lhg/b;)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v8, v9}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 677
    .line 678
    .line 679
    :goto_16
    check-cast v9, Lic/a;

    .line 680
    .line 681
    shl-int/lit8 v5, v16, 0x9

    .line 682
    .line 683
    and-int/lit16 v5, v5, 0x1c00

    .line 684
    .line 685
    or-int/lit8 v5, v5, 0x30

    .line 686
    .line 687
    and-int v7, v27, p2

    .line 688
    .line 689
    or-int/2addr v5, v7

    .line 690
    const/high16 v7, 0x30000

    .line 691
    .line 692
    or-int/2addr v5, v7

    .line 693
    const/16 v10, 0x180

    .line 694
    .line 695
    move-object v7, v6

    .line 696
    move-object v6, v9

    .line 697
    move v9, v5

    .line 698
    const/4 v5, 0x0

    .line 699
    move-object/from16 v16, v7

    .line 700
    .line 701
    const/4 v7, 0x0

    .line 702
    move-object/from16 v28, v4

    .line 703
    .line 704
    move-object/from16 v4, v18

    .line 705
    .line 706
    invoke-static/range {v0 .. v10}, Lm0/t6;->b(FLic/k;Lj1/q;ZLoc/a;ILic/a;Lm0/v1;Lx0/o;II)V

    .line 707
    .line 708
    .line 709
    move/from16 v24, v3

    .line 710
    .line 711
    move-object/from16 v25, v4

    .line 712
    .line 713
    if-eqz p6, :cond_25

    .line 714
    .line 715
    const v0, 0x692f2c85

    .line 716
    .line 717
    .line 718
    invoke-virtual {v8, v0}, Lx0/o;->W(I)V

    .line 719
    .line 720
    .line 721
    invoke-interface/range {v16 .. v16}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    check-cast v0, Ljava/lang/Number;

    .line 726
    .line 727
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 728
    .line 729
    .line 730
    move-result v0

    .line 731
    new-instance v1, Ljava/math/BigDecimal;

    .line 732
    .line 733
    float-to-double v2, v0

    .line 734
    invoke-direct {v1, v2, v3}, Ljava/math/BigDecimal;-><init>(D)V

    .line 735
    .line 736
    .line 737
    sget-object v0, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 738
    .line 739
    const/4 v2, 0x2

    .line 740
    invoke-virtual {v1, v2, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    .line 745
    .line 746
    .line 747
    move-result v0

    .line 748
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    move-object/from16 v1, v33

    .line 753
    .line 754
    invoke-interface {v1, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    check-cast v0, Ljava/lang/String;

    .line 759
    .line 760
    if-eqz v24, :cond_21

    .line 761
    .line 762
    const v2, -0x7038308e

    .line 763
    .line 764
    .line 765
    invoke-virtual {v8, v2}, Lx0/o;->W(I)V

    .line 766
    .line 767
    .line 768
    sget-object v2, Lm0/j1;->a:Lx0/z;

    .line 769
    .line 770
    invoke-virtual {v8, v2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    check-cast v2, Lq1/q;

    .line 775
    .line 776
    iget-wide v2, v2, Lq1/q;->a:J

    .line 777
    .line 778
    sget-object v4, Lm0/c1;->a:Lx0/o2;

    .line 779
    .line 780
    invoke-virtual {v8, v4}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v4

    .line 784
    check-cast v4, Lm0/b1;

    .line 785
    .line 786
    invoke-virtual {v4}, Lm0/b1;->j()Z

    .line 787
    .line 788
    .line 789
    move-result v4

    .line 790
    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    .line 791
    .line 792
    if-eqz v4, :cond_1f

    .line 793
    .line 794
    invoke-static {v2, v3}, Lq1/h0;->r(J)F

    .line 795
    .line 796
    .line 797
    move-result v2

    .line 798
    float-to-double v2, v2

    .line 799
    cmpl-double v4, v2, v5

    .line 800
    .line 801
    if-lez v4, :cond_20

    .line 802
    .line 803
    goto :goto_17

    .line 804
    :cond_1f
    invoke-static {v2, v3}, Lq1/h0;->r(J)F

    .line 805
    .line 806
    .line 807
    move-result v2

    .line 808
    float-to-double v2, v2

    .line 809
    cmpg-double v4, v2, v5

    .line 810
    .line 811
    if-gez v4, :cond_20

    .line 812
    .line 813
    :goto_17
    const/high16 v2, 0x3f800000    # 1.0f

    .line 814
    .line 815
    :goto_18
    const/4 v3, 0x0

    .line 816
    goto :goto_19

    .line 817
    :cond_20
    const v2, 0x3f5eb852    # 0.87f

    .line 818
    .line 819
    .line 820
    goto :goto_18

    .line 821
    :goto_19
    invoke-virtual {v8, v3}, Lx0/o;->p(Z)V

    .line 822
    .line 823
    .line 824
    goto :goto_1c

    .line 825
    :cond_21
    const v2, -0x703829ca

    .line 826
    .line 827
    .line 828
    invoke-virtual {v8, v2}, Lx0/o;->W(I)V

    .line 829
    .line 830
    .line 831
    sget-object v2, Lm0/j1;->a:Lx0/z;

    .line 832
    .line 833
    invoke-virtual {v8, v2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    check-cast v2, Lq1/q;

    .line 838
    .line 839
    iget-wide v2, v2, Lq1/q;->a:J

    .line 840
    .line 841
    sget-object v4, Lm0/c1;->a:Lx0/o2;

    .line 842
    .line 843
    invoke-virtual {v8, v4}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v4

    .line 847
    check-cast v4, Lm0/b1;

    .line 848
    .line 849
    invoke-virtual {v4}, Lm0/b1;->j()Z

    .line 850
    .line 851
    .line 852
    move-result v4

    .line 853
    if-eqz v4, :cond_22

    .line 854
    .line 855
    invoke-static {v2, v3}, Lq1/h0;->r(J)F

    .line 856
    .line 857
    .line 858
    :goto_1a
    const/4 v3, 0x0

    .line 859
    goto :goto_1b

    .line 860
    :cond_22
    invoke-static {v2, v3}, Lq1/h0;->r(J)F

    .line 861
    .line 862
    .line 863
    goto :goto_1a

    .line 864
    :goto_1b
    invoke-virtual {v8, v3}, Lx0/o;->p(Z)V

    .line 865
    .line 866
    .line 867
    const v2, 0x3ec28f5c    # 0.38f

    .line 868
    .line 869
    .line 870
    :goto_1c
    invoke-static {v2, v11, v12}, Lq1/q;->b(FJ)J

    .line 871
    .line 872
    .line 873
    move-result-wide v4

    .line 874
    const/high16 v2, 0x3f000000    # 0.5f

    .line 875
    .line 876
    float-to-double v6, v2

    .line 877
    cmpl-double v9, v6, v21

    .line 878
    .line 879
    if-lez v9, :cond_23

    .line 880
    .line 881
    goto :goto_1d

    .line 882
    :cond_23
    invoke-static {v14}, Lz/a;->a(Ljava/lang/String;)V

    .line 883
    .line 884
    .line 885
    :goto_1d
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    .line 886
    .line 887
    cmpl-float v7, v2, v15

    .line 888
    .line 889
    if-lez v7, :cond_24

    .line 890
    .line 891
    :goto_1e
    const/4 v2, 0x1

    .line 892
    goto :goto_1f

    .line 893
    :cond_24
    const/high16 v15, 0x3f000000    # 0.5f

    .line 894
    .line 895
    goto :goto_1e

    .line 896
    :goto_1f
    invoke-direct {v6, v15, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    .line 897
    .line 898
    .line 899
    const/16 v7, 0x8

    .line 900
    .line 901
    int-to-float v7, v7

    .line 902
    const/16 v33, 0x0

    .line 903
    .line 904
    const/16 v34, 0xe

    .line 905
    .line 906
    const/16 v31, 0x0

    .line 907
    .line 908
    const/16 v32, 0x0

    .line 909
    .line 910
    move-object/from16 v29, v6

    .line 911
    .line 912
    move/from16 v30, v7

    .line 913
    .line 914
    invoke-static/range {v29 .. v34}, Landroidx/compose/foundation/layout/a;->n(Lj1/q;FFFFI)Lj1/q;

    .line 915
    .line 916
    .line 917
    move-result-object v6

    .line 918
    const/16 v21, 0x0

    .line 919
    .line 920
    const v22, 0x1fff8

    .line 921
    .line 922
    .line 923
    move-wide v2, v4

    .line 924
    const/16 v17, 0x0

    .line 925
    .line 926
    const/16 v20, 0x1

    .line 927
    .line 928
    const-wide/16 v4, 0x0

    .line 929
    .line 930
    move-object/from16 v33, v1

    .line 931
    .line 932
    move-object v1, v6

    .line 933
    const/4 v6, 0x0

    .line 934
    const/4 v7, 0x0

    .line 935
    const-wide/16 v8, 0x0

    .line 936
    .line 937
    const/4 v10, 0x0

    .line 938
    move-wide v12, v11

    .line 939
    const/4 v11, 0x0

    .line 940
    move-wide v14, v12

    .line 941
    const-wide/16 v12, 0x0

    .line 942
    .line 943
    move-wide v15, v14

    .line 944
    const/4 v14, 0x0

    .line 945
    move-wide/from16 v18, v15

    .line 946
    .line 947
    const/4 v15, 0x0

    .line 948
    const/16 v16, 0x0

    .line 949
    .line 950
    const/16 v26, 0x0

    .line 951
    .line 952
    const/16 v17, 0x0

    .line 953
    .line 954
    move-wide/from16 v29, v18

    .line 955
    .line 956
    const/16 v18, 0x0

    .line 957
    .line 958
    const/16 v19, 0x1

    .line 959
    .line 960
    const/16 v20, 0x0

    .line 961
    .line 962
    move-object/from16 v19, p11

    .line 963
    .line 964
    invoke-static/range {v0 .. v22}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 965
    .line 966
    .line 967
    move-object/from16 v8, v19

    .line 968
    .line 969
    const/4 v3, 0x0

    .line 970
    :goto_20
    invoke-virtual {v8, v3}, Lx0/o;->p(Z)V

    .line 971
    .line 972
    .line 973
    const/4 v2, 0x1

    .line 974
    goto :goto_21

    .line 975
    :cond_25
    move-wide/from16 v29, v11

    .line 976
    .line 977
    const/4 v3, 0x0

    .line 978
    const v0, 0x68f6d3f4

    .line 979
    .line 980
    .line 981
    invoke-virtual {v8, v0}, Lx0/o;->W(I)V

    .line 982
    .line 983
    .line 984
    goto :goto_20

    .line 985
    :goto_21
    invoke-virtual {v8, v2}, Lx0/o;->p(Z)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v8, v2}, Lx0/o;->p(Z)V

    .line 989
    .line 990
    .line 991
    move-object/from16 v3, v23

    .line 992
    .line 993
    move/from16 v11, v24

    .line 994
    .line 995
    move-object/from16 v6, v25

    .line 996
    .line 997
    move-object/from16 v5, v28

    .line 998
    .line 999
    move-wide/from16 v9, v29

    .line 1000
    .line 1001
    move-object/from16 v8, v33

    .line 1002
    .line 1003
    goto :goto_22

    .line 1004
    :cond_26
    invoke-virtual {v8}, Lx0/o;->Q()V

    .line 1005
    .line 1006
    .line 1007
    move-object/from16 v3, p2

    .line 1008
    .line 1009
    move-object/from16 v8, p7

    .line 1010
    .line 1011
    move-wide/from16 v9, p8

    .line 1012
    .line 1013
    move-object v5, v0

    .line 1014
    :goto_22
    invoke-virtual/range {p11 .. p11}, Lx0/o;->r()Lx0/p1;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v14

    .line 1018
    if-eqz v14, :cond_27

    .line 1019
    .line 1020
    new-instance v0, Lz8/k;

    .line 1021
    .line 1022
    move-object/from16 v1, p0

    .line 1023
    .line 1024
    move-object/from16 v2, p1

    .line 1025
    .line 1026
    move/from16 v4, p3

    .line 1027
    .line 1028
    move/from16 v7, p6

    .line 1029
    .line 1030
    move/from16 v12, p12

    .line 1031
    .line 1032
    move/from16 v13, p13

    .line 1033
    .line 1034
    invoke-direct/range {v0 .. v13}, Lz8/k;-><init>(Ljava/lang/String;Ljava/lang/String;Lj1/q;FLic/k;Loc/a;ZLic/k;JZII)V

    .line 1035
    .line 1036
    .line 1037
    iput-object v0, v14, Lx0/p1;->d:Lic/n;

    .line 1038
    .line 1039
    :cond_27
    return-void
.end method
