.class public abstract Lm0/g5;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:F

.field public static final b:Lr/r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget v0, Lm0/d5;->a:F

    .line 2
    .line 3
    const/16 v0, 0x28

    .line 4
    .line 5
    int-to-float v0, v0

    .line 6
    sput v0, Lm0/g5;->a:F

    .line 7
    .line 8
    new-instance v0, Lr/r;

    .line 9
    .line 10
    const v1, 0x3e4ccccd    # 0.2f

    .line 11
    .line 12
    .line 13
    const v2, 0x3f4ccccd    # 0.8f

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Lr/r;-><init>(FF)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lr/r;

    .line 20
    .line 21
    const v2, 0x3ecccccd    # 0.4f

    .line 22
    .line 23
    .line 24
    const/high16 v3, 0x3f800000    # 1.0f

    .line 25
    .line 26
    invoke-direct {v0, v2, v3}, Lr/r;-><init>(FF)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Lr/r;

    .line 30
    .line 31
    const v3, 0x3f266666    # 0.65f

    .line 32
    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v0, v4, v3}, Lr/r;-><init>(FF)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lr/r;

    .line 39
    .line 40
    const v3, 0x3dcccccd    # 0.1f

    .line 41
    .line 42
    .line 43
    const v4, 0x3ee66666    # 0.45f

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v3, v4}, Lr/r;-><init>(FF)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Lr/r;

    .line 50
    .line 51
    invoke-direct {v0, v2, v1}, Lr/r;-><init>(FF)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lm0/g5;->b:Lr/r;

    .line 55
    .line 56
    return-void
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

.method public static final a(Lj1/q;JFJILx0/o;II)V
    .locals 28

    .line 1
    move-object/from16 v5, p7

    .line 2
    .line 3
    move/from16 v8, p8

    .line 4
    .line 5
    const v0, -0x42b466e0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v5, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, p9, 0x2

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    move-wide/from16 v0, p1

    .line 16
    .line 17
    invoke-virtual {v5, v0, v1}, Lx0/o;->e(J)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    const/16 v2, 0x20

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-wide/from16 v0, p1

    .line 27
    .line 28
    :cond_1
    const/16 v2, 0x10

    .line 29
    .line 30
    :goto_0
    or-int/2addr v2, v8

    .line 31
    and-int/lit8 v3, p9, 0x4

    .line 32
    .line 33
    if-eqz v3, :cond_3

    .line 34
    .line 35
    or-int/lit16 v2, v2, 0x180

    .line 36
    .line 37
    :cond_2
    move/from16 v4, p3

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    and-int/lit16 v4, v8, 0x180

    .line 41
    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    move/from16 v4, p3

    .line 45
    .line 46
    invoke-virtual {v5, v4}, Lx0/o;->c(F)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_4

    .line 51
    .line 52
    const/16 v6, 0x100

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_4
    const/16 v6, 0x80

    .line 56
    .line 57
    :goto_1
    or-int/2addr v2, v6

    .line 58
    :goto_2
    or-int/lit16 v2, v2, 0x2c00

    .line 59
    .line 60
    and-int/lit16 v6, v2, 0x2493

    .line 61
    .line 62
    const/16 v7, 0x2492

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    if-eq v6, v7, :cond_5

    .line 66
    .line 67
    const/4 v6, 0x1

    .line 68
    goto :goto_3

    .line 69
    :cond_5
    const/4 v6, 0x0

    .line 70
    :goto_3
    and-int/lit8 v7, v2, 0x1

    .line 71
    .line 72
    invoke-virtual {v5, v7, v6}, Lx0/o;->N(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_13

    .line 77
    .line 78
    invoke-virtual {v5}, Lx0/o;->S()V

    .line 79
    .line 80
    .line 81
    and-int/lit8 v6, v8, 0x1

    .line 82
    .line 83
    const v7, -0xe001

    .line 84
    .line 85
    .line 86
    const/4 v13, 0x2

    .line 87
    if-eqz v6, :cond_8

    .line 88
    .line 89
    invoke-virtual {v5}, Lx0/o;->x()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_6

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    invoke-virtual {v5}, Lx0/o;->Q()V

    .line 97
    .line 98
    .line 99
    and-int/lit8 v3, p9, 0x2

    .line 100
    .line 101
    if-eqz v3, :cond_7

    .line 102
    .line 103
    and-int/lit8 v2, v2, -0x71

    .line 104
    .line 105
    :cond_7
    and-int/2addr v2, v7

    .line 106
    move-wide/from16 v18, p4

    .line 107
    .line 108
    move-wide v14, v0

    .line 109
    move v0, v4

    .line 110
    move/from16 v1, p6

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_8
    :goto_4
    and-int/lit8 v6, p9, 0x2

    .line 114
    .line 115
    if-eqz v6, :cond_9

    .line 116
    .line 117
    sget-object v0, Lm0/c1;->a:Lx0/o2;

    .line 118
    .line 119
    invoke-virtual {v5, v0}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lm0/b1;

    .line 124
    .line 125
    invoke-virtual {v0}, Lm0/b1;->f()J

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    and-int/lit8 v2, v2, -0x71

    .line 130
    .line 131
    :cond_9
    if-eqz v3, :cond_a

    .line 132
    .line 133
    sget v3, Lm0/d5;->a:F

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_a
    move v3, v4

    .line 137
    :goto_5
    sget-wide v14, Lq1/q;->g:J

    .line 138
    .line 139
    and-int/2addr v2, v7

    .line 140
    move-wide/from16 v18, v14

    .line 141
    .line 142
    move-wide v14, v0

    .line 143
    move v0, v3

    .line 144
    const/4 v1, 0x2

    .line 145
    :goto_6
    invoke-virtual {v5}, Lx0/o;->q()V

    .line 146
    .line 147
    .line 148
    sget-object v3, Lj2/l1;->h:Lx0/o2;

    .line 149
    .line 150
    invoke-virtual {v5, v3}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Lf3/c;

    .line 155
    .line 156
    new-instance v26, Ls1/h;

    .line 157
    .line 158
    invoke-interface {v3, v0}, Lf3/c;->Q(F)F

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    const/4 v4, 0x0

    .line 163
    const/16 v6, 0x1a

    .line 164
    .line 165
    const/4 v7, 0x0

    .line 166
    move/from16 p4, v1

    .line 167
    .line 168
    move/from16 p2, v3

    .line 169
    .line 170
    move-object/from16 p1, v26

    .line 171
    .line 172
    const/16 p3, 0x0

    .line 173
    .line 174
    const/16 p5, 0x0

    .line 175
    .line 176
    const/16 p6, 0x1a

    .line 177
    .line 178
    invoke-direct/range {p1 .. p6}, Ls1/h;-><init>(FFIII)V

    .line 179
    .line 180
    .line 181
    move/from16 v27, p4

    .line 182
    .line 183
    move/from16 v17, v0

    .line 184
    .line 185
    invoke-static {v5}, Lr/d;->p(Lx0/o;)Lr/e0;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    const/4 v3, 0x5

    .line 194
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    move v4, v2

    .line 199
    move-object v2, v3

    .line 200
    sget-object v3, Lr/w1;->b:Lr/v1;

    .line 201
    .line 202
    sget-object v6, Lr/w;->d:Lm4/d1;

    .line 203
    .line 204
    const/16 v7, 0x1a04

    .line 205
    .line 206
    invoke-static {v7, v11, v6, v13}, Lr/d;->r(IILr/v;I)Lr/u1;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-static {v7}, Lr/d;->o(Lr/u;)Lr/b0;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    move-object/from16 v16, v6

    .line 215
    .line 216
    const v6, 0x81b8

    .line 217
    .line 218
    .line 219
    move/from16 v20, v4

    .line 220
    .line 221
    move-object v4, v7

    .line 222
    const/16 v7, 0x10

    .line 223
    .line 224
    move-object/from16 v12, v16

    .line 225
    .line 226
    move/from16 v9, v20

    .line 227
    .line 228
    move-object/from16 v10, v26

    .line 229
    .line 230
    invoke-static/range {v0 .. v7}, Lr/d;->j(Lr/e0;Ljava/lang/Number;Ljava/lang/Number;Lr/v1;Lr/b0;Lx0/o;II)Lr/c0;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    const/16 v2, 0x534

    .line 235
    .line 236
    invoke-static {v2, v11, v12, v13}, Lr/d;->r(IILr/v;I)Lr/u1;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-static {v2}, Lr/d;->o(Lr/u;)Lr/b0;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    const/high16 v3, 0x438f0000    # 286.0f

    .line 245
    .line 246
    invoke-static {v0, v3, v2, v5}, Lr/d;->g(Lr/e0;FLr/b0;Lx0/o;)Lr/c0;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v5}, Lx0/o;->K()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    sget-object v4, Lx0/k;->a:Lx0/r0;

    .line 255
    .line 256
    if-ne v3, v4, :cond_b

    .line 257
    .line 258
    new-instance v3, Lm0/l3;

    .line 259
    .line 260
    const/4 v6, 0x3

    .line 261
    invoke-direct {v3, v6}, Lm0/l3;-><init>(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    :cond_b
    check-cast v3, Lic/k;

    .line 268
    .line 269
    new-instance v6, Lr/h0;

    .line 270
    .line 271
    new-instance v7, Lr/g0;

    .line 272
    .line 273
    invoke-direct {v7}, Lr/g0;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-interface {v3, v7}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    invoke-direct {v6, v7}, Lr/h0;-><init>(Lr/g0;)V

    .line 280
    .line 281
    .line 282
    invoke-static {v6}, Lr/d;->o(Lr/u;)Lr/b0;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    const/high16 v6, 0x43910000    # 290.0f

    .line 287
    .line 288
    invoke-static {v0, v6, v3, v5}, Lr/d;->g(Lr/e0;FLr/b0;Lx0/o;)Lr/c0;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-virtual {v5}, Lx0/o;->K()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    if-ne v7, v4, :cond_c

    .line 297
    .line 298
    new-instance v7, Lm0/l3;

    .line 299
    .line 300
    const/4 v12, 0x4

    .line 301
    invoke-direct {v7, v12}, Lm0/l3;-><init>(I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v5, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    :cond_c
    check-cast v7, Lic/k;

    .line 308
    .line 309
    new-instance v12, Lr/h0;

    .line 310
    .line 311
    new-instance v13, Lr/g0;

    .line 312
    .line 313
    invoke-direct {v13}, Lr/g0;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-interface {v7, v13}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    invoke-direct {v12, v13}, Lr/h0;-><init>(Lr/g0;)V

    .line 320
    .line 321
    .line 322
    invoke-static {v12}, Lr/d;->o(Lr/u;)Lr/b0;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    invoke-static {v0, v6, v7, v5}, Lr/d;->g(Lr/e0;FLr/b0;Lx0/o;)Lr/c0;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    sget-object v6, Ls/k;->g:Ls/k;

    .line 331
    .line 332
    const/4 v12, 0x1

    .line 333
    move-object/from16 v7, p0

    .line 334
    .line 335
    invoke-static {v7, v12, v6}, Lq2/m;->a(Lj1/q;ZLic/k;)Lj1/q;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    sget v13, Lm0/g5;->a:F

    .line 340
    .line 341
    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/c;->j(Lj1/q;F)Lj1/q;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    invoke-virtual {v5, v10}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v13

    .line 349
    invoke-virtual {v5, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v20

    .line 353
    or-int v13, v13, v20

    .line 354
    .line 355
    invoke-virtual {v5, v3}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v20

    .line 359
    or-int v13, v13, v20

    .line 360
    .line 361
    invoke-virtual {v5, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v20

    .line 365
    or-int v13, v13, v20

    .line 366
    .line 367
    invoke-virtual {v5, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v20

    .line 371
    or-int v13, v13, v20

    .line 372
    .line 373
    and-int/lit16 v12, v9, 0x380

    .line 374
    .line 375
    const/16 v11, 0x100

    .line 376
    .line 377
    if-ne v12, v11, :cond_d

    .line 378
    .line 379
    const/4 v11, 0x1

    .line 380
    goto :goto_7

    .line 381
    :cond_d
    const/4 v11, 0x0

    .line 382
    :goto_7
    or-int/2addr v11, v13

    .line 383
    and-int/lit8 v12, v9, 0x70

    .line 384
    .line 385
    xor-int/lit8 v12, v12, 0x30

    .line 386
    .line 387
    const/16 v13, 0x20

    .line 388
    .line 389
    if-le v12, v13, :cond_e

    .line 390
    .line 391
    invoke-virtual {v5, v14, v15}, Lx0/o;->e(J)Z

    .line 392
    .line 393
    .line 394
    move-result v12

    .line 395
    if-nez v12, :cond_f

    .line 396
    .line 397
    :cond_e
    and-int/lit8 v9, v9, 0x30

    .line 398
    .line 399
    if-ne v9, v13, :cond_10

    .line 400
    .line 401
    :cond_f
    const/4 v12, 0x1

    .line 402
    goto :goto_8

    .line 403
    :cond_10
    const/4 v12, 0x0

    .line 404
    :goto_8
    or-int v9, v11, v12

    .line 405
    .line 406
    invoke-virtual {v5}, Lx0/o;->K()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v11

    .line 410
    if-nez v9, :cond_12

    .line 411
    .line 412
    if-ne v11, v4, :cond_11

    .line 413
    .line 414
    goto :goto_9

    .line 415
    :cond_11
    move-wide/from16 v20, v14

    .line 416
    .line 417
    goto :goto_a

    .line 418
    :cond_12
    :goto_9
    new-instance v16, Lm0/e5;

    .line 419
    .line 420
    move-object/from16 v24, v0

    .line 421
    .line 422
    move-object/from16 v22, v1

    .line 423
    .line 424
    move-object/from16 v25, v2

    .line 425
    .line 426
    move-object/from16 v23, v3

    .line 427
    .line 428
    move-object/from16 v26, v10

    .line 429
    .line 430
    move-wide/from16 v20, v14

    .line 431
    .line 432
    invoke-direct/range {v16 .. v26}, Lm0/e5;-><init>(FJJLr/c0;Lr/c0;Lr/c0;Lr/c0;Ls1/h;)V

    .line 433
    .line 434
    .line 435
    move-object/from16 v11, v16

    .line 436
    .line 437
    invoke-virtual {v5, v11}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    :goto_a
    check-cast v11, Lic/k;

    .line 441
    .line 442
    const/4 v0, 0x0

    .line 443
    invoke-static {v0, v11, v6, v5}, Lnh/b;->a(ILic/k;Lj1/q;Lx0/o;)V

    .line 444
    .line 445
    .line 446
    move/from16 v4, v17

    .line 447
    .line 448
    move-wide/from16 v5, v18

    .line 449
    .line 450
    move-wide/from16 v2, v20

    .line 451
    .line 452
    move/from16 v7, v27

    .line 453
    .line 454
    goto :goto_b

    .line 455
    :cond_13
    move-object/from16 v7, p0

    .line 456
    .line 457
    invoke-virtual {v5}, Lx0/o;->Q()V

    .line 458
    .line 459
    .line 460
    move-wide/from16 v5, p4

    .line 461
    .line 462
    move/from16 v7, p6

    .line 463
    .line 464
    move-wide v2, v0

    .line 465
    :goto_b
    invoke-virtual/range {p7 .. p7}, Lx0/o;->r()Lx0/p1;

    .line 466
    .line 467
    .line 468
    move-result-object v10

    .line 469
    if-eqz v10, :cond_14

    .line 470
    .line 471
    new-instance v0, Lm0/f5;

    .line 472
    .line 473
    move-object/from16 v1, p0

    .line 474
    .line 475
    move/from16 v9, p9

    .line 476
    .line 477
    invoke-direct/range {v0 .. v9}, Lm0/f5;-><init>(Lj1/q;JFJIII)V

    .line 478
    .line 479
    .line 480
    iput-object v0, v10, Lx0/p1;->d:Lic/n;

    .line 481
    .line 482
    :cond_14
    return-void
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
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
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
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
.end method

.method public static final b(Ls1/d;FFJLs1/h;)V
    .locals 12

    .line 1
    move-object/from16 v10, p5

    .line 2
    .line 3
    iget v0, v10, Ls1/h;->a:F

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    int-to-float v1, v1

    .line 7
    div-float/2addr v0, v1

    .line 8
    invoke-interface {p0}, Ls1/d;->e()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const/16 v4, 0x20

    .line 13
    .line 14
    shr-long/2addr v2, v4

    .line 15
    long-to-int v3, v2

    .line 16
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    mul-float v1, v1, v0

    .line 21
    .line 22
    sub-float/2addr v2, v1

    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    int-to-long v5, v1

    .line 28
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    int-to-long v0, v0

    .line 33
    shl-long/2addr v5, v4

    .line 34
    const-wide v7, 0xffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v0, v7

    .line 40
    or-long/2addr v5, v0

    .line 41
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    int-to-long v0, v0

    .line 46
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    int-to-long v2, v2

    .line 51
    shl-long/2addr v0, v4

    .line 52
    and-long/2addr v2, v7

    .line 53
    or-long v7, v0, v2

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    const/16 v11, 0x340

    .line 57
    .line 58
    move-object v0, p0

    .line 59
    move v3, p1

    .line 60
    move v4, p2

    .line 61
    move-wide v1, p3

    .line 62
    invoke-static/range {v0 .. v11}, Lq/t0;->h(Ls1/d;JFFJJFLs1/h;I)V

    .line 63
    .line 64
    .line 65
    return-void
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
.end method
