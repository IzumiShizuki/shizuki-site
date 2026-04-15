.class public abstract Landroidx/compose/material/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x38

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, Landroidx/compose/material/a;->a:F

    .line 5
    .line 6
    const/16 v0, 0x7d

    .line 7
    .line 8
    int-to-float v0, v0

    .line 9
    sput v0, Landroidx/compose/material/a;->b:F

    .line 10
    .line 11
    const/16 v0, 0x280

    .line 12
    .line 13
    int-to-float v0, v0

    .line 14
    sput v0, Landroidx/compose/material/a;->c:F

    .line 15
    .line 16
    return-void
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
.end method

.method public static final a(Lf1/f;Lj1/q;Li7/p2;ZLg0/f;FJJJLx0/o;I)V
    .locals 23

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v13, p12

    .line 4
    .line 5
    const v0, -0x140aff0a

    .line 6
    .line 7
    .line 8
    invoke-virtual {v13, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 9
    .line 10
    .line 11
    or-int/lit8 v0, p13, 0x30

    .line 12
    .line 13
    invoke-virtual {v13, v3}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/16 v1, 0x100

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v1, 0x80

    .line 23
    .line 24
    :goto_0
    or-int/2addr v0, v1

    .line 25
    or-int/lit16 v0, v0, 0xc00

    .line 26
    .line 27
    move-object/from16 v5, p4

    .line 28
    .line 29
    invoke-virtual {v13, v5}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const/16 v1, 0x4000

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v1, 0x2000

    .line 39
    .line 40
    :goto_1
    or-int/2addr v0, v1

    .line 41
    const/high16 v1, 0x2490000

    .line 42
    .line 43
    or-int/2addr v0, v1

    .line 44
    const v1, 0x12492493

    .line 45
    .line 46
    .line 47
    and-int/2addr v1, v0

    .line 48
    const v2, 0x12492492

    .line 49
    .line 50
    .line 51
    if-eq v1, v2, :cond_2

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/4 v1, 0x0

    .line 56
    :goto_2
    and-int/lit8 v2, v0, 0x1

    .line 57
    .line 58
    invoke-virtual {v13, v2, v1}, Lx0/o;->N(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_16

    .line 63
    .line 64
    invoke-virtual {v13}, Lx0/o;->S()V

    .line 65
    .line 66
    .line 67
    and-int/lit8 v1, p13, 0x1

    .line 68
    .line 69
    sget-object v2, Lj1/n;->a:Lj1/n;

    .line 70
    .line 71
    const v7, -0xfff0001

    .line 72
    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    invoke-virtual {v13}, Lx0/o;->x()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    invoke-virtual {v13}, Lx0/o;->Q()V

    .line 84
    .line 85
    .line 86
    and-int/2addr v0, v7

    .line 87
    move/from16 v1, p3

    .line 88
    .line 89
    move/from16 v11, p5

    .line 90
    .line 91
    move-wide/from16 v9, p6

    .line 92
    .line 93
    move-wide/from16 v7, p8

    .line 94
    .line 95
    move-wide/from16 v14, p10

    .line 96
    .line 97
    move v12, v0

    .line 98
    move-object/from16 v0, p1

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_4
    :goto_3
    sget v1, Lm0/i4;->a:F

    .line 102
    .line 103
    sget-object v8, Lm0/c1;->a:Lx0/o2;

    .line 104
    .line 105
    invoke-virtual {v13, v8}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    check-cast v9, Lm0/b1;

    .line 110
    .line 111
    invoke-virtual {v9}, Lm0/b1;->i()J

    .line 112
    .line 113
    .line 114
    move-result-wide v9

    .line 115
    invoke-static {v9, v10, v13}, Lm0/c1;->b(JLx0/o;)J

    .line 116
    .line 117
    .line 118
    move-result-wide v11

    .line 119
    invoke-virtual {v13, v8}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    check-cast v8, Lm0/b1;

    .line 124
    .line 125
    invoke-virtual {v8}, Lm0/b1;->e()J

    .line 126
    .line 127
    .line 128
    move-result-wide v14

    .line 129
    const v8, 0x3ea3d70a    # 0.32f

    .line 130
    .line 131
    .line 132
    invoke-static {v8, v14, v15}, Lq1/q;->b(FJ)J

    .line 133
    .line 134
    .line 135
    move-result-wide v14

    .line 136
    and-int/2addr v0, v7

    .line 137
    move-wide v7, v11

    .line 138
    move v12, v0

    .line 139
    move v11, v1

    .line 140
    move-object v0, v2

    .line 141
    const/4 v1, 0x1

    .line 142
    :goto_4
    invoke-virtual {v13}, Lx0/o;->q()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    sget-object v4, Lx0/k;->a:Lx0/r0;

    .line 150
    .line 151
    if-ne v6, v4, :cond_5

    .line 152
    .line 153
    invoke-static {v13}, Lx0/v;->m(Lx0/o;)Lhf/y;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-virtual {v13, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_5
    check-cast v6, Lhf/y;

    .line 161
    .line 162
    move/from16 p1, v1

    .line 163
    .line 164
    sget-object v1, Lj1/c;->a:Lj1/h;

    .line 165
    .line 166
    move-wide/from16 v16, v7

    .line 167
    .line 168
    const/4 v5, 0x0

    .line 169
    invoke-static {v1, v5}, Ly/p;->d(Lj1/h;Z)Lg2/v0;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-static {v13}, Lx0/v;->q(Lx0/o;)I

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    invoke-virtual {v13}, Lx0/o;->l()Lx0/j1;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    move-wide/from16 v18, v9

    .line 182
    .line 183
    invoke-static {v0, v13}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    sget-object v10, Li2/k;->g0:Li2/j;

    .line 188
    .line 189
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    sget-object v10, Li2/j;->b:Li2/i;

    .line 193
    .line 194
    invoke-virtual {v13}, Lx0/o;->a0()V

    .line 195
    .line 196
    .line 197
    move-object/from16 p3, v0

    .line 198
    .line 199
    iget-boolean v0, v13, Lx0/o;->S:Z

    .line 200
    .line 201
    if-eqz v0, :cond_6

    .line 202
    .line 203
    invoke-virtual {v13, v10}, Lx0/o;->k(Lic/a;)V

    .line 204
    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_6
    invoke-virtual {v13}, Lx0/o;->k0()V

    .line 208
    .line 209
    .line 210
    :goto_5
    sget-object v0, Li2/j;->g:Li2/h;

    .line 211
    .line 212
    invoke-static {v0, v7, v13}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 213
    .line 214
    .line 215
    sget-object v7, Li2/j;->f:Li2/h;

    .line 216
    .line 217
    invoke-static {v7, v8, v13}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 218
    .line 219
    .line 220
    sget-object v8, Li2/j;->j:Li2/h;

    .line 221
    .line 222
    move/from16 p11, v11

    .line 223
    .line 224
    iget-boolean v11, v13, Lx0/o;->S:Z

    .line 225
    .line 226
    if-nez v11, :cond_7

    .line 227
    .line 228
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    move/from16 v20, v12

    .line 233
    .line 234
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object v12

    .line 238
    invoke-static {v11, v12}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v11

    .line 242
    if-nez v11, :cond_8

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_7
    move/from16 v20, v12

    .line 246
    .line 247
    :goto_6
    invoke-static {v5, v13, v5, v8}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 248
    .line 249
    .line 250
    :cond_8
    sget-object v5, Li2/j;->d:Li2/h;

    .line 251
    .line 252
    invoke-static {v5, v9, v13}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 253
    .line 254
    .line 255
    sget-object v9, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 256
    .line 257
    const/4 v11, 0x0

    .line 258
    invoke-static {v1, v11}, Ly/p;->d(Lj1/h;Z)Lg2/v0;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-static {v13}, Lx0/v;->q(Lx0/o;)I

    .line 263
    .line 264
    .line 265
    move-result v11

    .line 266
    invoke-virtual {v13}, Lx0/o;->l()Lx0/j1;

    .line 267
    .line 268
    .line 269
    move-result-object v12

    .line 270
    invoke-static {v9, v13}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    invoke-virtual {v13}, Lx0/o;->a0()V

    .line 275
    .line 276
    .line 277
    move-wide/from16 p5, v14

    .line 278
    .line 279
    iget-boolean v14, v13, Lx0/o;->S:Z

    .line 280
    .line 281
    if-eqz v14, :cond_9

    .line 282
    .line 283
    invoke-virtual {v13, v10}, Lx0/o;->k(Lic/a;)V

    .line 284
    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_9
    invoke-virtual {v13}, Lx0/o;->k0()V

    .line 288
    .line 289
    .line 290
    :goto_7
    invoke-static {v0, v1, v13}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 291
    .line 292
    .line 293
    invoke-static {v7, v12, v13}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 294
    .line 295
    .line 296
    iget-boolean v0, v13, Lx0/o;->S:Z

    .line 297
    .line 298
    if-nez v0, :cond_a

    .line 299
    .line 300
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-static {v0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-nez v0, :cond_b

    .line 313
    .line 314
    :cond_a
    invoke-static {v11, v13, v11, v8}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 315
    .line 316
    .line 317
    :cond_b
    invoke-static {v5, v9, v13}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 318
    .line 319
    .line 320
    const/4 v0, 0x6

    .line 321
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    sget-object v1, Lfa/b;->b:Lf1/f;

    .line 326
    .line 327
    invoke-virtual {v1, v13, v0}, Lf1/f;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v13, v3}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    invoke-virtual {v13, v6}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    or-int/2addr v0, v1

    .line 339
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    if-nez v0, :cond_c

    .line 344
    .line 345
    if-ne v1, v4, :cond_d

    .line 346
    .line 347
    :cond_c
    new-instance v1, Lm0/j4;

    .line 348
    .line 349
    const/4 v0, 0x1

    .line 350
    invoke-direct {v1, v3, v6, v0}, Lm0/j4;-><init>(Li7/p2;Lhf/y;I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v13, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    :cond_d
    check-cast v1, Lic/a;

    .line 357
    .line 358
    iget-object v0, v3, Li7/p2;->a:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Lm0/x;

    .line 361
    .line 362
    iget-object v5, v0, Lm0/x;->h:Lx0/c0;

    .line 363
    .line 364
    invoke-virtual {v5}, Lx0/c0;->getValue()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    sget-object v7, Lm0/r4;->a:Lm0/r4;

    .line 369
    .line 370
    if-eq v5, v7, :cond_e

    .line 371
    .line 372
    const/4 v5, 0x1

    .line 373
    goto :goto_8

    .line 374
    :cond_e
    const/4 v5, 0x0

    .line 375
    :goto_8
    const/4 v8, 0x0

    .line 376
    move-object/from16 p7, v1

    .line 377
    .line 378
    move/from16 p8, v5

    .line 379
    .line 380
    move-object/from16 p9, v13

    .line 381
    .line 382
    const/16 p10, 0x0

    .line 383
    .line 384
    invoke-static/range {p5 .. p10}, Landroidx/compose/material/a;->b(JLic/a;ZLx0/o;I)V

    .line 385
    .line 386
    .line 387
    move-wide/from16 v21, p5

    .line 388
    .line 389
    const/4 v5, 0x1

    .line 390
    invoke-virtual {v13, v5}, Lx0/o;->p(Z)V

    .line 391
    .line 392
    .line 393
    sget-object v1, Lj1/c;->b:Lj1/h;

    .line 394
    .line 395
    sget-object v8, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    .line 396
    .line 397
    invoke-virtual {v8, v2, v1}, Landroidx/compose/foundation/layout/b;->a(Lj1/q;Lj1/d;)Lj1/q;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    const/4 v8, 0x0

    .line 402
    invoke-static {v1, v8, v5}, Landroidx/compose/foundation/layout/c;->o(Lj1/q;FI)Lj1/q;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    const/high16 v8, 0x3f800000    # 1.0f

    .line 407
    .line 408
    invoke-static {v1, v8}, Landroidx/compose/foundation/layout/c;->c(Lj1/q;F)Lj1/q;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    if-eqz p1, :cond_11

    .line 413
    .line 414
    const v8, 0x14f19132

    .line 415
    .line 416
    .line 417
    invoke-virtual {v13, v8}, Lx0/o;->W(I)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v13, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v8

    .line 424
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    if-nez v8, :cond_f

    .line 429
    .line 430
    if-ne v9, v4, :cond_10

    .line 431
    .line 432
    :cond_f
    new-instance v9, Lm0/o4;

    .line 433
    .line 434
    invoke-direct {v9, v0}, Lm0/o4;-><init>(Lm0/x;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v13, v9}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    :cond_10
    check-cast v9, Lb2/a;

    .line 441
    .line 442
    const/4 v8, 0x0

    .line 443
    invoke-static {v2, v9, v8}, Landroidx/compose/ui/input/nestedscroll/a;->a(Lj1/q;Lb2/a;Lb2/d;)Lj1/q;

    .line 444
    .line 445
    .line 446
    move-result-object v8

    .line 447
    const/4 v11, 0x0

    .line 448
    invoke-virtual {v13, v11}, Lx0/o;->p(Z)V

    .line 449
    .line 450
    .line 451
    goto :goto_9

    .line 452
    :cond_11
    const/4 v11, 0x0

    .line 453
    const v8, 0x4affc3b8    # 8380892.0f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v13, v8}, Lx0/o;->W(I)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v13, v11}, Lx0/o;->p(Z)V

    .line 460
    .line 461
    .line 462
    move-object v8, v2

    .line 463
    :goto_9
    invoke-interface {v1, v8}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    new-instance v8, La9/r;

    .line 468
    .line 469
    const/16 v9, 0xa

    .line 470
    .line 471
    invoke-direct {v8, v9, v3}, La9/r;-><init>(ILjava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    new-instance v9, Landroidx/compose/material/DraggableAnchorsElement;

    .line 475
    .line 476
    invoke-direct {v9, v0, v8}, Landroidx/compose/material/DraggableAnchorsElement;-><init>(Lm0/x;La9/r;)V

    .line 477
    .line 478
    .line 479
    invoke-interface {v1, v9}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    iget-object v1, v3, Li7/p2;->a:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v1, Lm0/x;

    .line 486
    .line 487
    if-eqz p1, :cond_12

    .line 488
    .line 489
    iget-object v8, v1, Lm0/x;->g:Lx0/e1;

    .line 490
    .line 491
    invoke-virtual {v8}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v8

    .line 495
    if-eq v8, v7, :cond_12

    .line 496
    .line 497
    const/4 v7, 0x1

    .line 498
    goto :goto_a

    .line 499
    :cond_12
    const/4 v7, 0x0

    .line 500
    :goto_a
    const/4 v8, 0x0

    .line 501
    const/16 v9, 0x38

    .line 502
    .line 503
    sget-object v10, Lu/e1;->a:Lu/e1;

    .line 504
    .line 505
    move-object/from16 p5, v0

    .line 506
    .line 507
    move-object/from16 p6, v1

    .line 508
    .line 509
    move/from16 p8, v7

    .line 510
    .line 511
    move-object/from16 p7, v10

    .line 512
    .line 513
    const/16 p9, 0x0

    .line 514
    .line 515
    const/16 p10, 0x38

    .line 516
    .line 517
    invoke-static/range {p5 .. p10}, La/a;->q(Lj1/q;Lm0/x;Lu/e1;ZZI)Lj1/q;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    if-eqz p1, :cond_15

    .line 522
    .line 523
    const v1, 0x1500d902

    .line 524
    .line 525
    .line 526
    invoke-virtual {v13, v1}, Lx0/o;->W(I)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v13, v3}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v1

    .line 533
    invoke-virtual {v13, v6}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    or-int/2addr v1, v7

    .line 538
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v7

    .line 542
    if-nez v1, :cond_13

    .line 543
    .line 544
    if-ne v7, v4, :cond_14

    .line 545
    .line 546
    :cond_13
    new-instance v7, Lba/q0;

    .line 547
    .line 548
    invoke-direct {v7, v3, v6}, Lba/q0;-><init>(Li7/p2;Lhf/y;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v13, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    :cond_14
    check-cast v7, Lic/k;

    .line 555
    .line 556
    const/4 v11, 0x0

    .line 557
    invoke-static {v2, v11, v7}, Lq2/m;->a(Lj1/q;ZLic/k;)Lj1/q;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    invoke-virtual {v13, v11}, Lx0/o;->p(Z)V

    .line 562
    .line 563
    .line 564
    goto :goto_b

    .line 565
    :cond_15
    const/4 v11, 0x0

    .line 566
    const v1, 0x4b00f618    # 8451608.0f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v13, v1}, Lx0/o;->W(I)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v13, v11}, Lx0/o;->p(Z)V

    .line 573
    .line 574
    .line 575
    :goto_b
    invoke-interface {v0, v2}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    new-instance v0, Lm0/g0;

    .line 580
    .line 581
    const/4 v1, 0x4

    .line 582
    move-object/from16 v2, p0

    .line 583
    .line 584
    invoke-direct {v0, v2, v1}, Lm0/g0;-><init>(Lf1/f;I)V

    .line 585
    .line 586
    .line 587
    const v1, -0x5cd6198c

    .line 588
    .line 589
    .line 590
    invoke-static {v1, v0, v13}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 591
    .line 592
    .line 593
    move-result-object v12

    .line 594
    shr-int/lit8 v0, v20, 0x9

    .line 595
    .line 596
    and-int/lit8 v0, v0, 0x70

    .line 597
    .line 598
    const/high16 v1, 0x180000

    .line 599
    .line 600
    or-int v14, v0, v1

    .line 601
    .line 602
    const/16 v15, 0x10

    .line 603
    .line 604
    const/4 v10, 0x0

    .line 605
    move-object/from16 v5, p4

    .line 606
    .line 607
    move/from16 v11, p11

    .line 608
    .line 609
    move-wide/from16 v8, v16

    .line 610
    .line 611
    move-wide/from16 v6, v18

    .line 612
    .line 613
    const/4 v0, 0x1

    .line 614
    invoke-static/range {v4 .. v15}, Landroid/support/v4/media/session/b;->m(Lj1/q;Lq1/l0;JJLs/o;FLf1/f;Lx0/o;II)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v13, v0}, Lx0/o;->p(Z)V

    .line 618
    .line 619
    .line 620
    move/from16 v4, p1

    .line 621
    .line 622
    move-object/from16 v0, p3

    .line 623
    .line 624
    move v6, v11

    .line 625
    move-wide/from16 v9, v16

    .line 626
    .line 627
    move-wide/from16 v7, v18

    .line 628
    .line 629
    move-wide/from16 v11, v21

    .line 630
    .line 631
    goto :goto_c

    .line 632
    :cond_16
    move-object/from16 v2, p0

    .line 633
    .line 634
    invoke-virtual {v13}, Lx0/o;->Q()V

    .line 635
    .line 636
    .line 637
    move-object/from16 v0, p1

    .line 638
    .line 639
    move/from16 v4, p3

    .line 640
    .line 641
    move/from16 v6, p5

    .line 642
    .line 643
    move-wide/from16 v7, p6

    .line 644
    .line 645
    move-wide/from16 v9, p8

    .line 646
    .line 647
    move-wide/from16 v11, p10

    .line 648
    .line 649
    :goto_c
    invoke-virtual {v13}, Lx0/o;->r()Lx0/p1;

    .line 650
    .line 651
    .line 652
    move-result-object v14

    .line 653
    if-eqz v14, :cond_17

    .line 654
    .line 655
    move-object v2, v0

    .line 656
    new-instance v0, Lm0/k4;

    .line 657
    .line 658
    move-object/from16 v1, p0

    .line 659
    .line 660
    move-object/from16 v5, p4

    .line 661
    .line 662
    move/from16 v13, p13

    .line 663
    .line 664
    invoke-direct/range {v0 .. v13}, Lm0/k4;-><init>(Lf1/f;Lj1/q;Li7/p2;ZLg0/f;FJJJI)V

    .line 665
    .line 666
    .line 667
    iput-object v0, v14, Lx0/p1;->d:Lic/n;

    .line 668
    .line 669
    :cond_17
    return-void
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
.end method

.method public static final b(JLic/a;ZLx0/o;I)V
    .locals 20

    .line 1
    move-wide/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v0, p3

    .line 6
    .line 7
    move-object/from16 v9, p4

    .line 8
    .line 9
    move/from16 v10, p5

    .line 10
    .line 11
    const v4, -0x1f62403c

    .line 12
    .line 13
    .line 14
    invoke-virtual {v9, v4}, Lx0/o;->Y(I)Lx0/o;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v4, v10, 0x6

    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    invoke-virtual {v9, v1, v2}, Lx0/o;->e(J)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    const/4 v4, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v4, 0x2

    .line 31
    :goto_0
    or-int/2addr v4, v10

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v4, v10

    .line 34
    :goto_1
    and-int/lit8 v6, v10, 0x30

    .line 35
    .line 36
    const/16 v12, 0x20

    .line 37
    .line 38
    if-nez v6, :cond_3

    .line 39
    .line 40
    invoke-virtual {v9, v3}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    const/16 v6, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v6, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v4, v6

    .line 52
    :cond_3
    and-int/lit16 v6, v10, 0x180

    .line 53
    .line 54
    if-nez v6, :cond_5

    .line 55
    .line 56
    invoke-virtual {v9, v0}, Lx0/o;->g(Z)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_4

    .line 61
    .line 62
    const/16 v6, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v6, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v4, v6

    .line 68
    :cond_5
    move v13, v4

    .line 69
    and-int/lit16 v4, v13, 0x93

    .line 70
    .line 71
    const/16 v6, 0x92

    .line 72
    .line 73
    const/4 v15, 0x0

    .line 74
    if-eq v4, v6, :cond_6

    .line 75
    .line 76
    const/4 v4, 0x1

    .line 77
    goto :goto_4

    .line 78
    :cond_6
    const/4 v4, 0x0

    .line 79
    :goto_4
    and-int/lit8 v6, v13, 0x1

    .line 80
    .line 81
    invoke-virtual {v9, v6, v4}, Lx0/o;->N(IZ)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_13

    .line 86
    .line 87
    const-wide/16 v6, 0x10

    .line 88
    .line 89
    cmp-long v4, v1, v6

    .line 90
    .line 91
    if-eqz v4, :cond_12

    .line 92
    .line 93
    const v4, -0x2a8eebe0

    .line 94
    .line 95
    .line 96
    invoke-virtual {v9, v4}, Lx0/o;->W(I)V

    .line 97
    .line 98
    .line 99
    if-eqz v0, :cond_7

    .line 100
    .line 101
    const/high16 v4, 0x3f800000    # 1.0f

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_7
    const/4 v4, 0x0

    .line 105
    :goto_5
    new-instance v6, Lr/u1;

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    const/4 v8, 0x7

    .line 109
    invoke-direct {v6, v15, v7, v8}, Lr/u1;-><init>(ILr/v;I)V

    .line 110
    .line 111
    .line 112
    invoke-static {v4, v6, v9}, Lr/e;->b(FLr/j;Lx0/o;)Lx0/n2;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-static {v5, v9}, La2/c;->N(ILx0/o;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    sget-object v6, Lx0/k;->a:Lx0/r0;

    .line 121
    .line 122
    if-eqz v0, :cond_e

    .line 123
    .line 124
    const v7, -0x2a8b98b5

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9, v7}, Lx0/o;->W(I)V

    .line 128
    .line 129
    .line 130
    and-int/lit8 v7, v13, 0x70

    .line 131
    .line 132
    if-ne v7, v12, :cond_8

    .line 133
    .line 134
    const/4 v8, 0x1

    .line 135
    goto :goto_6

    .line 136
    :cond_8
    const/4 v8, 0x0

    .line 137
    :goto_6
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    if-nez v8, :cond_9

    .line 142
    .line 143
    if-ne v11, v6, :cond_a

    .line 144
    .line 145
    :cond_9
    new-instance v11, Lm0/r2;

    .line 146
    .line 147
    const/4 v8, 0x2

    .line 148
    invoke-direct {v11, v8, v3}, Lm0/r2;-><init>(ILic/a;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v9, v11}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_a
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 155
    .line 156
    new-instance v3, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    .line 157
    .line 158
    move-object v8, v6

    .line 159
    const/4 v6, 0x0

    .line 160
    move-object/from16 v16, v8

    .line 161
    .line 162
    const/4 v8, 0x6

    .line 163
    move-object/from16 v17, v5

    .line 164
    .line 165
    const/4 v5, 0x0

    .line 166
    move v14, v7

    .line 167
    move-object v7, v11

    .line 168
    move-object/from16 v18, v16

    .line 169
    .line 170
    move-object/from16 v15, v17

    .line 171
    .line 172
    move-object v11, v4

    .line 173
    move-object/from16 v4, p2

    .line 174
    .line 175
    invoke-direct/range {v3 .. v8}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 176
    .line 177
    .line 178
    move-object/from16 v19, v4

    .line 179
    .line 180
    move-object v4, v3

    .line 181
    move-object/from16 v3, v19

    .line 182
    .line 183
    invoke-virtual {v9, v15}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-ne v14, v12, :cond_b

    .line 188
    .line 189
    const/4 v6, 0x1

    .line 190
    goto :goto_7

    .line 191
    :cond_b
    const/4 v6, 0x0

    .line 192
    :goto_7
    or-int/2addr v5, v6

    .line 193
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    move-object/from16 v8, v18

    .line 198
    .line 199
    if-nez v5, :cond_c

    .line 200
    .line 201
    if-ne v6, v8, :cond_d

    .line 202
    .line 203
    :cond_c
    new-instance v6, Lm0/i2;

    .line 204
    .line 205
    const/4 v5, 0x2

    .line 206
    invoke-direct {v6, v15, v3, v5}, Lm0/i2;-><init>(Ljava/lang/String;Lic/a;I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v9, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_d
    check-cast v6, Lic/k;

    .line 213
    .line 214
    const/4 v5, 0x1

    .line 215
    invoke-static {v4, v5, v6}, Lq2/m;->a(Lj1/q;ZLic/k;)Lj1/q;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    const/4 v6, 0x0

    .line 220
    invoke-virtual {v9, v6}, Lx0/o;->p(Z)V

    .line 221
    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_e
    move-object v11, v4

    .line 225
    move-object v8, v6

    .line 226
    const/4 v5, 0x1

    .line 227
    const/4 v6, 0x0

    .line 228
    const v4, -0x2a860bea

    .line 229
    .line 230
    .line 231
    invoke-virtual {v9, v4}, Lx0/o;->W(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v9, v6}, Lx0/o;->p(Z)V

    .line 235
    .line 236
    .line 237
    sget-object v4, Lj1/n;->a:Lj1/n;

    .line 238
    .line 239
    :goto_8
    sget-object v6, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 240
    .line 241
    invoke-interface {v6, v4}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    and-int/lit8 v6, v13, 0xe

    .line 246
    .line 247
    const/4 v7, 0x4

    .line 248
    if-ne v6, v7, :cond_f

    .line 249
    .line 250
    const/4 v14, 0x1

    .line 251
    goto :goto_9

    .line 252
    :cond_f
    const/4 v14, 0x0

    .line 253
    :goto_9
    invoke-virtual {v9, v11}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    or-int/2addr v5, v14

    .line 258
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    if-nez v5, :cond_10

    .line 263
    .line 264
    if-ne v6, v8, :cond_11

    .line 265
    .line 266
    :cond_10
    new-instance v6, Ld9/u;

    .line 267
    .line 268
    const/4 v5, 0x3

    .line 269
    invoke-direct {v6, v1, v2, v11, v5}, Ld9/u;-><init>(JLjava/lang/Object;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v9, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_11
    check-cast v6, Lic/k;

    .line 276
    .line 277
    const/4 v5, 0x0

    .line 278
    invoke-static {v5, v6, v4, v9}, Lnh/b;->a(ILic/k;Lj1/q;Lx0/o;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v9, v5}, Lx0/o;->p(Z)V

    .line 282
    .line 283
    .line 284
    goto :goto_a

    .line 285
    :cond_12
    const/4 v5, 0x0

    .line 286
    const v4, -0x2a833842

    .line 287
    .line 288
    .line 289
    invoke-virtual {v9, v4}, Lx0/o;->W(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v9, v5}, Lx0/o;->p(Z)V

    .line 293
    .line 294
    .line 295
    goto :goto_a

    .line 296
    :cond_13
    invoke-virtual {v9}, Lx0/o;->Q()V

    .line 297
    .line 298
    .line 299
    :goto_a
    invoke-virtual {v9}, Lx0/o;->r()Lx0/p1;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    if-eqz v6, :cond_14

    .line 304
    .line 305
    new-instance v0, Lm0/l4;

    .line 306
    .line 307
    move/from16 v4, p3

    .line 308
    .line 309
    move v5, v10

    .line 310
    invoke-direct/range {v0 .. v5}, Lm0/l4;-><init>(JLic/a;ZI)V

    .line 311
    .line 312
    .line 313
    iput-object v0, v6, Lx0/p1;->d:Lic/n;

    .line 314
    .line 315
    :cond_14
    return-void
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
