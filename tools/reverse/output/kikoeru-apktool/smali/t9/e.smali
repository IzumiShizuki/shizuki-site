.class public abstract Lt9/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lub/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lq9/j0;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq9/j0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lt9/e;->a:Lub/p;

    .line 13
    .line 14
    return-void
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

.method public static final a(Lx0/w0;Lx0/o;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    move/from16 v1, p2

    .line 6
    .line 7
    const v2, 0x26b0af0c

    .line 8
    .line 9
    .line 10
    invoke-virtual {v13, v2}, Lx0/o;->Y(I)Lx0/o;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v2, v1, 0x3

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    if-eq v2, v3, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    :goto_0
    and-int/lit8 v3, v1, 0x1

    .line 22
    .line 23
    invoke-virtual {v13, v3, v2}, Lx0/o;->N(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_b

    .line 28
    .line 29
    invoke-static {v13}, Lj4/a;->a(Lx0/o;)Landroidx/lifecycle/x0;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_a

    .line 34
    .line 35
    instance-of v3, v2, Landroidx/lifecycle/k;

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    move-object v3, v2

    .line 40
    check-cast v3, Landroidx/lifecycle/k;

    .line 41
    .line 42
    invoke-interface {v3}, Landroidx/lifecycle/k;->c()Li4/e;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    sget-object v3, Li4/a;->b:Li4/a;

    .line 48
    .line 49
    :goto_1
    const-class v4, Lt9/g;

    .line 50
    .line 51
    sget-object v5, Ljc/z;->a:Ljc/a0;

    .line 52
    .line 53
    invoke-virtual {v5, v4}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-static {v2, v4, v5, v3}, Lg8/a;->w(Landroidx/lifecycle/x0;Lpc/c;Landroidx/lifecycle/u0;Li4/b;)Landroidx/lifecycle/s0;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Lt9/g;

    .line 63
    .line 64
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    sget-object v4, Lx0/k;->a:Lx0/r0;

    .line 69
    .line 70
    if-ne v3, v4, :cond_2

    .line 71
    .line 72
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-static {v3}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v13, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    move-object v6, v3

    .line 82
    check-cast v6, Lx0/w0;

    .line 83
    .line 84
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    if-ne v3, v4, :cond_3

    .line 89
    .line 90
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-static {v3}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v13, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    move-object v8, v3

    .line 100
    check-cast v8, Lx0/w0;

    .line 101
    .line 102
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    if-ne v3, v4, :cond_4

    .line 107
    .line 108
    const-wide/16 v9, 0x0

    .line 109
    .line 110
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-static {v3}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v13, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    move-object v9, v3

    .line 122
    check-cast v9, Lx0/w0;

    .line 123
    .line 124
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    if-ne v3, v4, :cond_5

    .line 129
    .line 130
    const-string v3, ""

    .line 131
    .line 132
    invoke-static {v3}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v13, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    move-object v11, v3

    .line 140
    check-cast v11, Lx0/w0;

    .line 141
    .line 142
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    if-ne v3, v4, :cond_6

    .line 147
    .line 148
    sget-object v3, Lt9/a;->a:Lt9/a;

    .line 149
    .line 150
    invoke-static {v3}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {v13, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_6
    move-object v10, v3

    .line 158
    check-cast v10, Lx0/w0;

    .line 159
    .line 160
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    if-ne v3, v4, :cond_7

    .line 165
    .line 166
    new-instance v3, Lma/c;

    .line 167
    .line 168
    const/16 v5, 0x1b

    .line 169
    .line 170
    invoke-direct {v3, v10, v5}, Lma/c;-><init>(Lx0/w0;I)V

    .line 171
    .line 172
    .line 173
    invoke-static {v3}, Lx0/v;->o(Lic/a;)Lx0/c0;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v13, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_7
    move-object v7, v3

    .line 181
    check-cast v7, Lx0/n2;

    .line 182
    .line 183
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    check-cast v3, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-nez v3, :cond_8

    .line 194
    .line 195
    invoke-virtual {v13}, Lx0/o;->r()Lx0/p1;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    if-eqz v2, :cond_c

    .line 200
    .line 201
    new-instance v3, Laa/g;

    .line 202
    .line 203
    const/16 v4, 0x14

    .line 204
    .line 205
    invoke-direct {v3, v0, v1, v4}, Laa/g;-><init>(Lx0/w0;II)V

    .line 206
    .line 207
    .line 208
    iput-object v3, v2, Lx0/p1;->d:Lic/n;

    .line 209
    .line 210
    return-void

    .line 211
    :cond_8
    invoke-virtual {v13}, Lx0/o;->K()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    if-ne v3, v4, :cond_9

    .line 216
    .line 217
    new-instance v3, Lm9/i;

    .line 218
    .line 219
    const/4 v4, 0x3

    .line 220
    invoke-direct {v3, v0, v8, v9, v4}, Lm9/i;-><init>(Lx0/w0;Lx0/w0;Lx0/w0;I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v13, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    :cond_9
    check-cast v3, Lic/a;

    .line 227
    .line 228
    new-instance v4, Lha/c;

    .line 229
    .line 230
    invoke-direct {v4, v2, v0, v10, v11}, Lha/c;-><init>(Lt9/g;Lx0/w0;Lx0/w0;Lx0/w0;)V

    .line 231
    .line 232
    .line 233
    const v2, -0x285b203c

    .line 234
    .line 235
    .line 236
    invoke-static {v2, v4, v13}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    new-instance v4, Laa/g;

    .line 241
    .line 242
    const/16 v5, 0x15

    .line 243
    .line 244
    invoke-direct {v4, v0, v5}, Laa/g;-><init>(Lx0/w0;I)V

    .line 245
    .line 246
    .line 247
    const v5, -0xf72a67e

    .line 248
    .line 249
    .line 250
    invoke-static {v5, v4, v13}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    new-instance v5, Lt9/b;

    .line 255
    .line 256
    invoke-direct/range {v5 .. v11}, Lt9/b;-><init>(Lx0/w0;Lx0/n2;Lx0/w0;Lx0/w0;Lx0/w0;Lx0/w0;)V

    .line 257
    .line 258
    .line 259
    const v6, 0x975d340

    .line 260
    .line 261
    .line 262
    invoke-static {v6, v5, v13}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    const v14, 0x36c30

    .line 267
    .line 268
    .line 269
    const/16 v15, 0x3c4

    .line 270
    .line 271
    move-object v1, v3

    .line 272
    const/4 v3, 0x0

    .line 273
    sget-object v5, Lt9/i;->e:Lf1/f;

    .line 274
    .line 275
    const/4 v7, 0x0

    .line 276
    const-wide/16 v8, 0x0

    .line 277
    .line 278
    const-wide/16 v10, 0x0

    .line 279
    .line 280
    const/4 v12, 0x0

    .line 281
    invoke-static/range {v1 .. v15}, La2/c;->b(Lic/a;Lf1/f;Lj1/q;Lic/n;Lic/n;Lic/n;Lq1/l0;JJLj3/q;Lx0/o;II)V

    .line 282
    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 286
    .line 287
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 288
    .line 289
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw v0

    .line 293
    :cond_b
    invoke-virtual/range {p1 .. p1}, Lx0/o;->Q()V

    .line 294
    .line 295
    .line 296
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lx0/o;->r()Lx0/p1;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    if-eqz v1, :cond_c

    .line 301
    .line 302
    new-instance v2, Laa/g;

    .line 303
    .line 304
    const/16 v3, 0x16

    .line 305
    .line 306
    move/from16 v4, p2

    .line 307
    .line 308
    invoke-direct {v2, v0, v4, v3}, Laa/g;-><init>(Lx0/w0;II)V

    .line 309
    .line 310
    .line 311
    iput-object v2, v1, Lx0/p1;->d:Lic/n;

    .line 312
    .line 313
    :cond_c
    return-void
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

.method public static final b(ILx0/o;)V
    .locals 16

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    const v1, 0x5fce353d

    .line 6
    .line 7
    .line 8
    invoke-virtual {v4, v1}, Lx0/o;->Y(I)Lx0/o;

    .line 9
    .line 10
    .line 11
    const/4 v13, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    and-int/lit8 v2, v0, 0x1

    .line 19
    .line 20
    invoke-virtual {v4, v2, v1}, Lx0/o;->N(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_e

    .line 25
    .line 26
    invoke-static {v4}, Lj4/a;->a(Lx0/o;)Landroidx/lifecycle/x0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_d

    .line 31
    .line 32
    instance-of v2, v1, Landroidx/lifecycle/k;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    move-object v2, v1

    .line 37
    check-cast v2, Landroidx/lifecycle/k;

    .line 38
    .line 39
    invoke-interface {v2}, Landroidx/lifecycle/k;->c()Li4/e;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    sget-object v2, Li4/a;->b:Li4/a;

    .line 45
    .line 46
    :goto_1
    const-class v3, Lt9/g;

    .line 47
    .line 48
    sget-object v5, Ljc/z;->a:Ljc/a0;

    .line 49
    .line 50
    invoke-virtual {v5, v3}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-static {v1, v3, v5, v2}, Lg8/a;->w(Landroidx/lifecycle/x0;Lpc/c;Landroidx/lifecycle/u0;Li4/b;)Landroidx/lifecycle/s0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    move-object v8, v1

    .line 60
    check-cast v8, Lt9/g;

    .line 61
    .line 62
    const v1, -0x5aea1a06

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v1}, Lx0/o;->W(I)V

    .line 66
    .line 67
    .line 68
    iget-object v1, v8, Lt9/g;->b:Lwb/e;

    .line 69
    .line 70
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    iget v2, v1, Lwb/e;->i:I

    .line 73
    .line 74
    invoke-static {v2}, Lvb/w;->t(I)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-direct {v9, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Lwb/e;->entrySet()Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_2

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Ljava/util/Map$Entry;

    .line 100
    .line 101
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Llf/f;

    .line 110
    .line 111
    invoke-static {v2, v4}, Lj7/d;->a(Llf/f;Lx0/o;)Lj7/b;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-interface {v9, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    invoke-virtual {v4, v7}, Lx0/o;->p(Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Lx0/o;->K()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    sget-object v14, Lx0/k;->a:Lx0/r0;

    .line 127
    .line 128
    if-ne v1, v14, :cond_3

    .line 129
    .line 130
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v4, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_3
    move-object v15, v1

    .line 140
    check-cast v15, Lx0/w0;

    .line 141
    .line 142
    const/4 v1, 0x6

    .line 143
    invoke-static {v15, v4, v1}, Lt9/e;->a(Lx0/w0;Lx0/o;I)V

    .line 144
    .line 145
    .line 146
    sget-object v1, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 147
    .line 148
    sget-object v2, Lj1/c;->a:Lj1/h;

    .line 149
    .line 150
    invoke-static {v2, v7}, Ly/p;->d(Lj1/h;Z)Lg2/v0;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-static {v4}, Lx0/v;->q(Lx0/o;)I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    invoke-virtual {v4}, Lx0/o;->l()Lx0/j1;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-static {v1, v4}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    sget-object v6, Li2/k;->g0:Li2/j;

    .line 167
    .line 168
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    sget-object v6, Li2/j;->b:Li2/i;

    .line 172
    .line 173
    invoke-virtual {v4}, Lx0/o;->a0()V

    .line 174
    .line 175
    .line 176
    iget-boolean v10, v4, Lx0/o;->S:Z

    .line 177
    .line 178
    if-eqz v10, :cond_4

    .line 179
    .line 180
    invoke-virtual {v4, v6}, Lx0/o;->k(Lic/a;)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_4
    invoke-virtual {v4}, Lx0/o;->k0()V

    .line 185
    .line 186
    .line 187
    :goto_3
    sget-object v6, Li2/j;->g:Li2/h;

    .line 188
    .line 189
    invoke-static {v6, v2, v4}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 190
    .line 191
    .line 192
    sget-object v2, Li2/j;->f:Li2/h;

    .line 193
    .line 194
    invoke-static {v2, v5, v4}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 195
    .line 196
    .line 197
    sget-object v2, Li2/j;->j:Li2/h;

    .line 198
    .line 199
    iget-boolean v5, v4, Lx0/o;->S:Z

    .line 200
    .line 201
    if-nez v5, :cond_5

    .line 202
    .line 203
    invoke-virtual {v4}, Lx0/o;->K()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    invoke-static {v5, v6}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-nez v5, :cond_6

    .line 216
    .line 217
    :cond_5
    invoke-static {v3, v4, v3, v2}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 218
    .line 219
    .line 220
    :cond_6
    sget-object v2, Li2/j;->d:Li2/h;

    .line 221
    .line 222
    invoke-static {v2, v1, v4}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v9}, Ljava/util/Map;->isEmpty()Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-eqz v1, :cond_7

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_7
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_9

    .line 245
    .line 246
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    check-cast v2, Ljava/util/Map$Entry;

    .line 251
    .line 252
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    check-cast v2, Lj7/b;

    .line 257
    .line 258
    invoke-virtual {v2}, Lj7/b;->c()I

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    if-nez v2, :cond_8

    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_8
    const v1, -0x6fc24a61

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4, v1}, Lx0/o;->W(I)V

    .line 269
    .line 270
    .line 271
    :goto_5
    invoke-virtual {v4, v7}, Lx0/o;->p(Z)V

    .line 272
    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_9
    :goto_6
    const v1, -0x6f8e81a4

    .line 276
    .line 277
    .line 278
    invoke-virtual {v4, v1}, Lx0/o;->W(I)V

    .line 279
    .line 280
    .line 281
    const v1, 0x7f0c015a

    .line 282
    .line 283
    .line 284
    invoke-static {v1}, Lna/q;->g(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    sget-object v3, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 289
    .line 290
    const/16 v5, 0x180

    .line 291
    .line 292
    const/4 v6, 0x2

    .line 293
    const/4 v2, 0x0

    .line 294
    invoke-static/range {v1 .. v6}, Lka/b;->k(Ljava/lang/String;Ljava/lang/Object;Lj1/q;Lx0/o;II)V

    .line 295
    .line 296
    .line 297
    goto :goto_5

    .line 298
    :goto_7
    sget-object v6, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 299
    .line 300
    const/4 v1, 0x5

    .line 301
    int-to-float v1, v1

    .line 302
    new-instance v11, Ly/e1;

    .line 303
    .line 304
    invoke-direct {v11, v1, v1, v1, v1}, Ly/e1;-><init>(FFFF)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4, v9}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    invoke-virtual {v4, v8}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    or-int/2addr v1, v2

    .line 316
    invoke-virtual {v4}, Lx0/o;->K()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    if-nez v1, :cond_a

    .line 321
    .line 322
    if-ne v2, v14, :cond_b

    .line 323
    .line 324
    :cond_a
    new-instance v2, Lba/q0;

    .line 325
    .line 326
    const/16 v1, 0x13

    .line 327
    .line 328
    invoke-direct {v2, v1, v9, v8}, Lba/q0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v4, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_b
    check-cast v2, Lic/k;

    .line 335
    .line 336
    const/16 v1, 0x186

    .line 337
    .line 338
    move-object v4, v2

    .line 339
    const/16 v2, 0x1fa

    .line 340
    .line 341
    const/4 v3, 0x0

    .line 342
    const/4 v5, 0x0

    .line 343
    const/4 v7, 0x0

    .line 344
    const/4 v8, 0x0

    .line 345
    const/4 v10, 0x0

    .line 346
    const/4 v12, 0x0

    .line 347
    move-object/from16 v9, p1

    .line 348
    .line 349
    invoke-static/range {v1 .. v12}, La/a;->g(IILa0/g0;Lic/k;Lj1/f;Lj1/q;Ls/f;Lu/p0;Lx0/o;Ly/h;Ly/d1;Z)V

    .line 350
    .line 351
    .line 352
    move-object v4, v9

    .line 353
    sget-object v1, Lj1/c;->i:Lj1/h;

    .line 354
    .line 355
    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    .line 356
    .line 357
    sget-object v3, Lj1/n;->a:Lj1/n;

    .line 358
    .line 359
    invoke-virtual {v2, v3, v1}, Landroidx/compose/foundation/layout/b;->a(Lj1/q;Lj1/d;)Lj1/q;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    const/16 v2, 0x19

    .line 364
    .line 365
    int-to-float v2, v2

    .line 366
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/a;->j(Lj1/q;F)Lj1/q;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    sget-object v1, Lm0/c1;->a:Lx0/o2;

    .line 371
    .line 372
    invoke-virtual {v4, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    check-cast v1, Lm0/b1;

    .line 377
    .line 378
    invoke-virtual {v1}, Lm0/b1;->a()J

    .line 379
    .line 380
    .line 381
    move-result-wide v6

    .line 382
    invoke-virtual {v4}, Lx0/o;->K()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    if-ne v1, v14, :cond_c

    .line 387
    .line 388
    new-instance v1, Lma/c;

    .line 389
    .line 390
    const/16 v3, 0x1a

    .line 391
    .line 392
    invoke-direct {v1, v15, v3}, Lma/c;-><init>(Lx0/w0;I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v4, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    :cond_c
    check-cast v1, Lic/a;

    .line 399
    .line 400
    const v11, 0xc00006

    .line 401
    .line 402
    .line 403
    const/16 v12, 0x5c

    .line 404
    .line 405
    const/4 v3, 0x0

    .line 406
    const-wide/16 v4, 0x0

    .line 407
    .line 408
    const/4 v8, 0x0

    .line 409
    sget-object v9, Lt9/i;->b:Lf1/f;

    .line 410
    .line 411
    move-object/from16 v10, p1

    .line 412
    .line 413
    invoke-static/range {v1 .. v12}, Lm0/n3;->a(Lic/a;Lj1/q;Lq1/l0;JJLm0/s1;Lf1/f;Lx0/o;II)V

    .line 414
    .line 415
    .line 416
    move-object v4, v10

    .line 417
    invoke-virtual {v4, v13}, Lx0/o;->p(Z)V

    .line 418
    .line 419
    .line 420
    goto :goto_8

    .line 421
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 422
    .line 423
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 424
    .line 425
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v0

    .line 429
    :cond_e
    invoke-virtual {v4}, Lx0/o;->Q()V

    .line 430
    .line 431
    .line 432
    :goto_8
    invoke-virtual {v4}, Lx0/o;->r()Lx0/p1;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    if-eqz v1, :cond_f

    .line 437
    .line 438
    new-instance v2, Lt2/x;

    .line 439
    .line 440
    const/16 v3, 0xe

    .line 441
    .line 442
    invoke-direct {v2, v0, v3}, Lt2/x;-><init>(II)V

    .line 443
    .line 444
    .line 445
    iput-object v2, v1, Lx0/p1;->d:Lic/n;

    .line 446
    .line 447
    :cond_f
    return-void
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
.end method

.method public static final c(Ly/k1;Lx0/o;I)V
    .locals 11

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, -0x307f8e19

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 10
    .line 11
    .line 12
    and-int/lit8 v0, p2, 0x1

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    invoke-virtual {p1, v0, v1}, Lx0/o;->N(IZ)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, Lx0/k;->a:Lx0/r0;

    .line 30
    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    invoke-static {p1}, Lx0/v;->m(Lx0/o;)Lhf/y;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1, v0}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    check-cast v0, Lhf/y;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    if-ne v3, v1, :cond_3

    .line 53
    .line 54
    :cond_2
    new-instance v3, Lba/d;

    .line 55
    .line 56
    const/4 v1, 0x6

    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-direct {v3, v0, v1, v2}, Lba/d;-><init>(Lhf/y;IZ)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    move-object v4, v3

    .line 65
    check-cast v4, Lic/a;

    .line 66
    .line 67
    const/16 v9, 0x6000

    .line 68
    .line 69
    const/16 v10, 0xe

    .line 70
    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    sget-object v7, Lt9/i;->h:Lf1/f;

    .line 74
    .line 75
    move-object v8, p1

    .line 76
    invoke-static/range {v4 .. v10}, Lm0/p3;->a(Lic/a;Lj1/q;ZLic/n;Lx0/o;II)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    move-object v8, p1

    .line 81
    invoke-virtual {v8}, Lx0/o;->Q()V

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {v8}, Lx0/o;->r()Lx0/p1;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_5

    .line 89
    .line 90
    new-instance v0, Lr9/e;

    .line 91
    .line 92
    const/4 v1, 0x1

    .line 93
    invoke-direct {v0, p2, v1, p0}, Lr9/e;-><init>(IILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput-object v0, p1, Lx0/p1;->d:Lic/n;

    .line 97
    .line 98
    :cond_5
    return-void
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
