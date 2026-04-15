.class public final Lua/g;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic b:Lta/c;

.field public final synthetic c:I

.field public final synthetic d:Lic/k;


# direct methods
.method public constructor <init>(Lta/c;ILic/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lua/g;->b:Lta/c;

    .line 2
    .line 3
    iput p2, p0, Lua/g;->c:I

    .line 4
    .line 5
    iput-object p3, p0, Lua/g;->d:Lic/k;

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ly/t;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Lx0/o;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const-string v4, "$this$BoxWithConstraints"

    .line 20
    .line 21
    invoke-static {v1, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    and-int/lit8 v1, v3, 0x51

    .line 25
    .line 26
    const/16 v3, 0x10

    .line 27
    .line 28
    if-ne v1, v3, :cond_1

    .line 29
    .line 30
    invoke-virtual {v2}, Lx0/o;->z()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v2}, Lx0/o;->Q()V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_1
    :goto_0
    int-to-float v6, v3

    .line 43
    sget-object v4, Lj1/n;->a:Lj1/n;

    .line 44
    .line 45
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/a;->j(Lj1/q;F)Lj1/q;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v3, Landroidx/compose/foundation/layout/c;->b:Landroidx/compose/foundation/layout/FillElement;

    .line 50
    .line 51
    invoke-interface {v1, v3}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const/high16 v3, 0x3f800000    # 1.0f

    .line 56
    .line 57
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/c;->c(Lj1/q;F)Lj1/q;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const v5, -0x1cd0f17e

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v5}, Lx0/o;->X(I)V

    .line 65
    .line 66
    .line 67
    sget-object v5, Ly/k;->c:Ly/o0;

    .line 68
    .line 69
    sget-object v7, Lj1/c;->m:Lj1/f;

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    invoke-static {v5, v7, v2, v10}, Ly/u;->a(Ly/h;Lj1/f;Lx0/o;I)Ly/v;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const v7, -0x4ee9b9da

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v7}, Lx0/o;->X(I)V

    .line 80
    .line 81
    .line 82
    sget-object v7, Lj2/l1;->h:Lx0/o2;

    .line 83
    .line 84
    invoke-virtual {v2, v7}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    check-cast v7, Lf3/c;

    .line 89
    .line 90
    sget-object v8, Lj2/l1;->n:Lx0/o2;

    .line 91
    .line 92
    invoke-virtual {v2, v8}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    check-cast v8, Lf3/m;

    .line 97
    .line 98
    sget-object v9, Lj2/l1;->s:Lx0/o2;

    .line 99
    .line 100
    invoke-virtual {v2, v9}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    check-cast v9, Lj2/z2;

    .line 105
    .line 106
    sget-object v11, Li2/k;->g0:Li2/j;

    .line 107
    .line 108
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    sget-object v11, Li2/j;->b:Li2/i;

    .line 112
    .line 113
    new-instance v12, Lg2/e0;

    .line 114
    .line 115
    const/4 v13, 0x1

    .line 116
    invoke-direct {v12, v1, v13}, Lg2/e0;-><init>(Lj1/q;I)V

    .line 117
    .line 118
    .line 119
    new-instance v1, Lf1/f;

    .line 120
    .line 121
    const v13, -0x7e903e5b

    .line 122
    .line 123
    .line 124
    const/4 v14, 0x1

    .line 125
    invoke-direct {v1, v12, v13, v14}, Lf1/f;-><init>(Ljava/lang/Object;IZ)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Lx0/o;->a0()V

    .line 129
    .line 130
    .line 131
    iget-boolean v12, v2, Lx0/o;->S:Z

    .line 132
    .line 133
    if-eqz v12, :cond_2

    .line 134
    .line 135
    invoke-virtual {v2, v11}, Lx0/o;->k(Lic/a;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    invoke-virtual {v2}, Lx0/o;->k0()V

    .line 140
    .line 141
    .line 142
    :goto_1
    iput-boolean v10, v2, Lx0/o;->y:Z

    .line 143
    .line 144
    sget-object v11, Li2/j;->g:Li2/h;

    .line 145
    .line 146
    invoke-static {v11, v5, v2}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 147
    .line 148
    .line 149
    sget-object v5, Li2/j;->e:Li2/h;

    .line 150
    .line 151
    invoke-static {v5, v7, v2}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 152
    .line 153
    .line 154
    sget-object v5, Li2/j;->h:Li2/h;

    .line 155
    .line 156
    invoke-static {v5, v8, v2}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 157
    .line 158
    .line 159
    sget-object v5, Li2/j;->i:Li2/h;

    .line 160
    .line 161
    invoke-static {v5, v9, v2}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 162
    .line 163
    .line 164
    iget v5, v2, Lx0/o;->z:I

    .line 165
    .line 166
    if-ltz v5, :cond_3

    .line 167
    .line 168
    const/4 v5, 0x1

    .line 169
    goto :goto_2

    .line 170
    :cond_3
    const/4 v5, 0x0

    .line 171
    :goto_2
    iput-boolean v5, v2, Lx0/o;->y:Z

    .line 172
    .line 173
    new-instance v5, Lx0/y1;

    .line 174
    .line 175
    invoke-direct {v5, v2}, Lx0/y1;-><init>(Lx0/o;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-virtual {v1, v5, v2, v7}, Lf1/f;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    const v1, 0x7ab4aae9

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v1}, Lx0/o;->X(I)V

    .line 189
    .line 190
    .line 191
    const v1, -0x455f09d5

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v1}, Lx0/o;->X(I)V

    .line 195
    .line 196
    .line 197
    iget-object v1, v0, Lua/g;->b:Lta/c;

    .line 198
    .line 199
    invoke-static {v1, v2}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    iget-object v5, v0, Lua/g;->d:Lic/k;

    .line 204
    .line 205
    invoke-static {v5, v2}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/c;->c(Lj1/q;F)Lj1/q;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    const v7, 0x3f4ccccd    # 0.8f

    .line 214
    .line 215
    .line 216
    float-to-double v8, v7

    .line 217
    const-string v12, "invalid weight; must be greater than zero"

    .line 218
    .line 219
    const-wide/16 v15, 0x0

    .line 220
    .line 221
    cmpl-double v13, v8, v15

    .line 222
    .line 223
    if-lez v13, :cond_4

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_4
    invoke-static {v12}, Lz/a;->a(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :goto_3
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    .line 230
    .line 231
    invoke-direct {v8, v7, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v5, v8}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    check-cast v7, Lta/c;

    .line 243
    .line 244
    const v8, 0x44faf204

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v8}, Lx0/o;->X(I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v11}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    invoke-virtual {v2}, Lx0/o;->K()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    sget-object v13, Lx0/k;->a:Lx0/r0;

    .line 259
    .line 260
    if-nez v8, :cond_5

    .line 261
    .line 262
    if-ne v9, v13, :cond_6

    .line 263
    .line 264
    :cond_5
    new-instance v9, Lcg/c;

    .line 265
    .line 266
    const/4 v8, 0x7

    .line 267
    invoke-direct {v9, v11, v8}, Lcg/c;-><init>(Lx0/w0;I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v9}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    :cond_6
    invoke-virtual {v2, v10}, Lx0/o;->p(Z)V

    .line 274
    .line 275
    .line 276
    check-cast v9, Lic/k;

    .line 277
    .line 278
    iget v8, v0, Lua/g;->c:I

    .line 279
    .line 280
    shl-int/lit8 v8, v8, 0x6

    .line 281
    .line 282
    and-int/lit16 v8, v8, 0x1c00

    .line 283
    .line 284
    invoke-static {v8, v9, v5, v7, v2}, Lua/j;->c(ILic/k;Lj1/q;Lta/c;Lx0/o;)V

    .line 285
    .line 286
    .line 287
    const/4 v8, 0x0

    .line 288
    const/16 v9, 0xd

    .line 289
    .line 290
    const/4 v5, 0x0

    .line 291
    const/4 v7, 0x0

    .line 292
    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/a;->n(Lj1/q;FFFFI)Lj1/q;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/c;->c(Lj1/q;F)Lj1/q;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    const v4, 0x3e4ccccd    # 0.2f

    .line 301
    .line 302
    .line 303
    float-to-double v5, v4

    .line 304
    cmpl-double v7, v5, v15

    .line 305
    .line 306
    if-lez v7, :cond_7

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_7
    invoke-static {v12}, Lz/a;->a(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    :goto_4
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    .line 313
    .line 314
    invoke-direct {v5, v4, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    .line 315
    .line 316
    .line 317
    invoke-interface {v3, v5}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    const v4, 0x1e7b2b64

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, v4}, Lx0/o;->X(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v11}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    invoke-virtual {v2, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    or-int/2addr v4, v5

    .line 336
    invoke-virtual {v2}, Lx0/o;->K()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    if-nez v4, :cond_8

    .line 341
    .line 342
    if-ne v5, v13, :cond_9

    .line 343
    .line 344
    :cond_8
    new-instance v5, Leg/c;

    .line 345
    .line 346
    const/4 v4, 0x1

    .line 347
    invoke-direct {v5, v11, v1, v4}, Leg/c;-><init>(Lx0/w0;Lx0/w0;I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2, v5}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    :cond_9
    invoke-virtual {v2, v10}, Lx0/o;->p(Z)V

    .line 354
    .line 355
    .line 356
    check-cast v5, Lic/k;

    .line 357
    .line 358
    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    check-cast v1, Lta/c;

    .line 363
    .line 364
    invoke-static {v10, v5, v3, v1, v2}, Lnd/h;->a(ILic/k;Lj1/q;Lta/c;Lx0/o;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v10}, Lx0/o;->p(Z)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v10}, Lx0/o;->p(Z)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2, v14}, Lx0/o;->p(Z)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v10}, Lx0/o;->p(Z)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2, v10}, Lx0/o;->p(Z)V

    .line 380
    .line 381
    .line 382
    :goto_5
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 383
    .line 384
    return-object v1
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
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
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
.end method
