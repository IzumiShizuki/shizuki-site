.class public final Ls/i;
.super Lj1/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Li2/p;
.implements Li2/k1;


# instance fields
.field public o:J

.field public p:Lq1/m;

.field public q:F

.field public r:Lq1/l0;

.field public s:J

.field public t:Lf3/m;

.field public u:Lq1/h0;

.field public v:Lq1/l0;

.field public w:Lq1/h0;


# virtual methods
.method public final synthetic G()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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
.end method

.method public final R(Li2/l0;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Li2/l0;->a:Ls1/b;

    .line 6
    .line 7
    iget-object v3, v0, Ls/i;->r:Lq1/l0;

    .line 8
    .line 9
    sget-object v4, Lq1/h0;->a:Lq1/g0;

    .line 10
    .line 11
    if-ne v3, v4, :cond_2

    .line 12
    .line 13
    iget-wide v2, v0, Ls/i;->o:J

    .line 14
    .line 15
    sget-wide v4, Lq1/q;->h:J

    .line 16
    .line 17
    invoke-static {v2, v3, v4, v5}, Lq1/q;->c(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-wide v2, v0, Ls/i;->o:J

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    const/16 v7, 0x7e

    .line 27
    .line 28
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    invoke-static/range {v1 .. v7}, Lq/t0;->q(Ls1/d;JJFI)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v2, v0, Ls/i;->p:Lq1/m;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget v7, v0, Ls/i;->q:F

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    const/16 v9, 0x76

    .line 41
    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    const-wide/16 v5, 0x0

    .line 45
    .line 46
    move-object/from16 v1, p1

    .line 47
    .line 48
    invoke-static/range {v1 .. v9}, Lq/t0;->p(Li2/l0;Lq1/m;JJFLs1/e;I)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_1
    move-object/from16 v1, p1

    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_2
    iget-object v3, v2, Ls1/b;->b:Lc7/e1;

    .line 58
    .line 59
    invoke-virtual {v3}, Lc7/e1;->D()J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    iget-wide v5, v0, Ls/i;->s:J

    .line 64
    .line 65
    invoke-static {v3, v4, v5, v6}, Lp1/e;->a(JJ)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    invoke-virtual {v1}, Li2/l0;->getLayoutDirection()Lf3/m;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iget-object v4, v0, Ls/i;->t:Lf3/m;

    .line 76
    .line 77
    if-ne v3, v4, :cond_3

    .line 78
    .line 79
    iget-object v3, v0, Ls/i;->v:Lq1/l0;

    .line 80
    .line 81
    iget-object v4, v0, Ls/i;->r:Lq1/l0;

    .line 82
    .line 83
    invoke-static {v3, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    iget-object v3, v0, Ls/i;->u:Lq1/h0;

    .line 90
    .line 91
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :goto_0
    move-object v11, v3

    .line 95
    goto :goto_1

    .line 96
    :cond_3
    new-instance v3, Lb0/s1;

    .line 97
    .line 98
    const/16 v4, 0xf

    .line 99
    .line 100
    invoke-direct {v3, v4, v0, v1}, Lb0/s1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v3}, Li2/f;->t(Lj1/p;Lic/a;)V

    .line 104
    .line 105
    .line 106
    iget-object v3, v0, Ls/i;->w:Lq1/h0;

    .line 107
    .line 108
    const/4 v4, 0x0

    .line 109
    iput-object v4, v0, Ls/i;->w:Lq1/h0;

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :goto_1
    iput-object v11, v0, Ls/i;->u:Lq1/h0;

    .line 113
    .line 114
    iget-object v2, v2, Ls1/b;->b:Lc7/e1;

    .line 115
    .line 116
    invoke-virtual {v2}, Lc7/e1;->D()J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    iput-wide v2, v0, Ls/i;->s:J

    .line 121
    .line 122
    invoke-virtual {v1}, Li2/l0;->getLayoutDirection()Lf3/m;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    iput-object v2, v0, Ls/i;->t:Lf3/m;

    .line 127
    .line 128
    iget-object v2, v0, Ls/i;->r:Lq1/l0;

    .line 129
    .line 130
    iput-object v2, v0, Ls/i;->v:Lq1/l0;

    .line 131
    .line 132
    invoke-static {v11}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iget-wide v2, v0, Ls/i;->o:J

    .line 136
    .line 137
    sget-wide v4, Lq1/q;->h:J

    .line 138
    .line 139
    invoke-static {v2, v3, v4, v5}, Lq1/q;->c(JJ)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    const/16 v12, 0x20

    .line 144
    .line 145
    const-wide v13, 0xffffffffL

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    sget-object v5, Ls1/g;->a:Ls1/g;

    .line 151
    .line 152
    if-nez v2, :cond_8

    .line 153
    .line 154
    iget-wide v2, v0, Ls/i;->o:J

    .line 155
    .line 156
    instance-of v4, v11, Lq1/c0;

    .line 157
    .line 158
    const/high16 v8, 0x3f800000    # 1.0f

    .line 159
    .line 160
    if-eqz v4, :cond_4

    .line 161
    .line 162
    move-object v4, v11

    .line 163
    check-cast v4, Lq1/c0;

    .line 164
    .line 165
    iget-object v4, v4, Lq1/c0;->e:Lp1/c;

    .line 166
    .line 167
    iget v6, v4, Lp1/c;->a:F

    .line 168
    .line 169
    iget v7, v4, Lp1/c;->b:F

    .line 170
    .line 171
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    int-to-long v9, v6

    .line 176
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    int-to-long v6, v6

    .line 181
    shl-long/2addr v9, v12

    .line 182
    and-long/2addr v6, v13

    .line 183
    or-long/2addr v6, v9

    .line 184
    invoke-static {v4}, Lq1/h0;->w(Lp1/c;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v9

    .line 188
    move-wide/from16 v20, v9

    .line 189
    .line 190
    move-object v9, v5

    .line 191
    move-wide v4, v6

    .line 192
    move-wide/from16 v6, v20

    .line 193
    .line 194
    const/4 v10, 0x3

    .line 195
    invoke-virtual/range {v1 .. v10}, Li2/l0;->j0(JJJFLs1/e;I)V

    .line 196
    .line 197
    .line 198
    move-object v5, v9

    .line 199
    goto/16 :goto_2

    .line 200
    .line 201
    :cond_4
    instance-of v1, v11, Lq1/d0;

    .line 202
    .line 203
    if-eqz v1, :cond_6

    .line 204
    .line 205
    move-object v7, v11

    .line 206
    check-cast v7, Lq1/d0;

    .line 207
    .line 208
    move-wide v3, v2

    .line 209
    iget-object v2, v7, Lq1/d0;->f:Lq1/h;

    .line 210
    .line 211
    if-eqz v2, :cond_5

    .line 212
    .line 213
    move-object/from16 v1, p1

    .line 214
    .line 215
    move-object v6, v5

    .line 216
    const/high16 v5, 0x3f800000    # 1.0f

    .line 217
    .line 218
    invoke-virtual/range {v1 .. v6}, Li2/l0;->p(Lq1/e0;JFLs1/e;)V

    .line 219
    .line 220
    .line 221
    move-object v5, v6

    .line 222
    goto/16 :goto_2

    .line 223
    .line 224
    :cond_5
    move-wide v2, v3

    .line 225
    iget-object v1, v7, Lq1/d0;->e:Lp1/d;

    .line 226
    .line 227
    iget-wide v6, v1, Lp1/d;->h:J

    .line 228
    .line 229
    shr-long/2addr v6, v12

    .line 230
    long-to-int v4, v6

    .line 231
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    iget v6, v1, Lp1/d;->a:F

    .line 236
    .line 237
    iget v7, v1, Lp1/d;->b:F

    .line 238
    .line 239
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    int-to-long v8, v6

    .line 244
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    int-to-long v6, v6

    .line 249
    shl-long/2addr v8, v12

    .line 250
    and-long/2addr v6, v13

    .line 251
    or-long/2addr v6, v8

    .line 252
    invoke-virtual {v1}, Lp1/d;->b()F

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    invoke-virtual {v1}, Lp1/d;->a()F

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    int-to-long v8, v8

    .line 265
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    move-wide/from16 v16, v13

    .line 270
    .line 271
    const/16 v15, 0x20

    .line 272
    .line 273
    int-to-long v12, v1

    .line 274
    shl-long/2addr v8, v15

    .line 275
    and-long v12, v12, v16

    .line 276
    .line 277
    or-long/2addr v8, v12

    .line 278
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    int-to-long v12, v1

    .line 283
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    move-wide/from16 v18, v2

    .line 288
    .line 289
    int-to-long v1, v1

    .line 290
    shl-long v3, v12, v15

    .line 291
    .line 292
    and-long v1, v1, v16

    .line 293
    .line 294
    or-long/2addr v1, v3

    .line 295
    move-object v10, v5

    .line 296
    move-wide v4, v6

    .line 297
    move-wide v6, v8

    .line 298
    move-wide v8, v1

    .line 299
    move-wide/from16 v2, v18

    .line 300
    .line 301
    move-object/from16 v1, p1

    .line 302
    .line 303
    invoke-virtual/range {v1 .. v10}, Li2/l0;->e0(JJJJLs1/e;)V

    .line 304
    .line 305
    .line 306
    move-object v5, v10

    .line 307
    goto :goto_3

    .line 308
    :cond_6
    move-wide/from16 v16, v13

    .line 309
    .line 310
    const/16 v15, 0x20

    .line 311
    .line 312
    instance-of v1, v11, Lq1/b0;

    .line 313
    .line 314
    if-eqz v1, :cond_7

    .line 315
    .line 316
    move-object v1, v11

    .line 317
    check-cast v1, Lq1/b0;

    .line 318
    .line 319
    iget-object v1, v1, Lq1/b0;->e:Lq1/e0;

    .line 320
    .line 321
    move-wide v3, v2

    .line 322
    move-object v6, v5

    .line 323
    const/high16 v5, 0x3f800000    # 1.0f

    .line 324
    .line 325
    move-object v2, v1

    .line 326
    move-object/from16 v1, p1

    .line 327
    .line 328
    invoke-virtual/range {v1 .. v6}, Li2/l0;->p(Lq1/e0;JFLs1/e;)V

    .line 329
    .line 330
    .line 331
    move-object v5, v6

    .line 332
    goto :goto_3

    .line 333
    :cond_7
    new-instance v1, Lce/j0;

    .line 334
    .line 335
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 336
    .line 337
    .line 338
    throw v1

    .line 339
    :cond_8
    :goto_2
    move-wide/from16 v16, v13

    .line 340
    .line 341
    const/16 v15, 0x20

    .line 342
    .line 343
    :goto_3
    iget-object v2, v0, Ls/i;->p:Lq1/m;

    .line 344
    .line 345
    if-eqz v2, :cond_d

    .line 346
    .line 347
    iget v4, v0, Ls/i;->q:F

    .line 348
    .line 349
    instance-of v1, v11, Lq1/c0;

    .line 350
    .line 351
    const/4 v6, 0x3

    .line 352
    if-eqz v1, :cond_9

    .line 353
    .line 354
    check-cast v11, Lq1/c0;

    .line 355
    .line 356
    iget-object v1, v11, Lq1/c0;->e:Lp1/c;

    .line 357
    .line 358
    iget v3, v1, Lp1/c;->a:F

    .line 359
    .line 360
    iget v7, v1, Lp1/c;->b:F

    .line 361
    .line 362
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    int-to-long v8, v3

    .line 367
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    int-to-long v10, v3

    .line 372
    shl-long v7, v8, v15

    .line 373
    .line 374
    and-long v10, v10, v16

    .line 375
    .line 376
    or-long/2addr v7, v10

    .line 377
    invoke-static {v1}, Lq1/h0;->w(Lp1/c;)J

    .line 378
    .line 379
    .line 380
    move-result-wide v9

    .line 381
    move-wide/from16 v20, v7

    .line 382
    .line 383
    move v7, v4

    .line 384
    move-wide/from16 v3, v20

    .line 385
    .line 386
    move-object/from16 v1, p1

    .line 387
    .line 388
    move-object v8, v5

    .line 389
    move-wide v5, v9

    .line 390
    const/4 v9, 0x3

    .line 391
    invoke-virtual/range {v1 .. v9}, Li2/l0;->d(Lq1/m;JJFLs1/e;I)V

    .line 392
    .line 393
    .line 394
    goto/16 :goto_5

    .line 395
    .line 396
    :cond_9
    instance-of v1, v11, Lq1/d0;

    .line 397
    .line 398
    if-eqz v1, :cond_b

    .line 399
    .line 400
    check-cast v11, Lq1/d0;

    .line 401
    .line 402
    move-object v3, v2

    .line 403
    iget-object v2, v11, Lq1/d0;->f:Lq1/h;

    .line 404
    .line 405
    if-eqz v2, :cond_a

    .line 406
    .line 407
    :goto_4
    move-object/from16 v1, p1

    .line 408
    .line 409
    invoke-virtual/range {v1 .. v6}, Li2/l0;->N(Lq1/e0;Lq1/m;FLs1/e;I)V

    .line 410
    .line 411
    .line 412
    goto :goto_5

    .line 413
    :cond_a
    move-object v2, v3

    .line 414
    iget-object v1, v11, Lq1/d0;->e:Lp1/d;

    .line 415
    .line 416
    iget-wide v6, v1, Lp1/d;->h:J

    .line 417
    .line 418
    shr-long/2addr v6, v15

    .line 419
    long-to-int v3, v6

    .line 420
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    iget v6, v1, Lp1/d;->a:F

    .line 425
    .line 426
    iget v7, v1, Lp1/d;->b:F

    .line 427
    .line 428
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 429
    .line 430
    .line 431
    move-result v6

    .line 432
    int-to-long v8, v6

    .line 433
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    int-to-long v6, v6

    .line 438
    shl-long/2addr v8, v15

    .line 439
    and-long v6, v6, v16

    .line 440
    .line 441
    or-long/2addr v6, v8

    .line 442
    invoke-virtual {v1}, Lp1/d;->b()F

    .line 443
    .line 444
    .line 445
    move-result v8

    .line 446
    invoke-virtual {v1}, Lp1/d;->a()F

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 451
    .line 452
    .line 453
    move-result v8

    .line 454
    int-to-long v8, v8

    .line 455
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    int-to-long v10, v1

    .line 460
    shl-long/2addr v8, v15

    .line 461
    and-long v10, v10, v16

    .line 462
    .line 463
    or-long/2addr v8, v10

    .line 464
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    int-to-long v10, v1

    .line 469
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    int-to-long v12, v1

    .line 474
    shl-long/2addr v10, v15

    .line 475
    and-long v12, v12, v16

    .line 476
    .line 477
    or-long/2addr v10, v12

    .line 478
    move-wide/from16 v20, v8

    .line 479
    .line 480
    move v9, v4

    .line 481
    move-wide v3, v6

    .line 482
    move-wide v7, v10

    .line 483
    move-object v10, v5

    .line 484
    move-wide/from16 v5, v20

    .line 485
    .line 486
    move-object/from16 v1, p1

    .line 487
    .line 488
    invoke-virtual/range {v1 .. v10}, Li2/l0;->f(Lq1/m;JJJFLs1/e;)V

    .line 489
    .line 490
    .line 491
    goto :goto_5

    .line 492
    :cond_b
    instance-of v1, v11, Lq1/b0;

    .line 493
    .line 494
    if-eqz v1, :cond_c

    .line 495
    .line 496
    check-cast v11, Lq1/b0;

    .line 497
    .line 498
    iget-object v1, v11, Lq1/b0;->e:Lq1/e0;

    .line 499
    .line 500
    move-object v3, v2

    .line 501
    move-object v2, v1

    .line 502
    goto :goto_4

    .line 503
    :cond_c
    new-instance v1, Lce/j0;

    .line 504
    .line 505
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 506
    .line 507
    .line 508
    throw v1

    .line 509
    :cond_d
    :goto_5
    invoke-virtual/range {p1 .. p1}, Li2/l0;->b()V

    .line 510
    .line 511
    .line 512
    return-void
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
.end method

.method public final W()V
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Ls/i;->s:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ls/i;->t:Lf3/m;

    .line 10
    .line 11
    iput-object v0, p0, Ls/i;->u:Lq1/h0;

    .line 12
    .line 13
    iput-object v0, p0, Ls/i;->v:Lq1/l0;

    .line 14
    .line 15
    invoke-static {p0}, Li2/f;->m(Li2/p;)V

    .line 16
    .line 17
    .line 18
    return-void
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
