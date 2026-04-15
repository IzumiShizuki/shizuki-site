.class public abstract Lia/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lf1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Laa/b;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Laa/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lf1/f;

    .line 9
    .line 10
    const v2, -0x78a602b4

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v0, v2, v3}, Lf1/f;-><init>(Ljava/lang/Object;IZ)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lia/a;->a:Lf1/f;

    .line 18
    .line 19
    return-void
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

.method public static final a(Ljava/lang/String;Lx0/o;I)V
    .locals 13

    .line 1
    const v0, 0x5cee2060

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x4

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    :goto_0
    or-int/2addr v0, p2

    .line 19
    and-int/lit8 v3, v0, 0x3

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x1

    .line 23
    if-eq v3, v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v1, 0x0

    .line 28
    :goto_1
    and-int/lit8 v3, v0, 0x1

    .line 29
    .line 30
    invoke-virtual {p1, v3, v1}, Lx0/o;->N(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_c

    .line 35
    .line 36
    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lx0/o2;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    move-object v8, v3

    .line 43
    check-cast v8, Landroid/content/Context;

    .line 44
    .line 45
    invoke-static {p1}, Lj4/a;->a(Lx0/o;)Landroidx/lifecycle/x0;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const-string v12, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 50
    .line 51
    if-eqz v3, :cond_b

    .line 52
    .line 53
    instance-of v6, v3, Landroidx/lifecycle/k;

    .line 54
    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    move-object v6, v3

    .line 58
    check-cast v6, Landroidx/lifecycle/k;

    .line 59
    .line 60
    invoke-interface {v6}, Landroidx/lifecycle/k;->c()Li4/e;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    sget-object v6, Li4/a;->b:Li4/a;

    .line 66
    .line 67
    :goto_2
    const-class v7, Lia/b;

    .line 68
    .line 69
    sget-object v9, Ljc/z;->a:Ljc/a0;

    .line 70
    .line 71
    invoke-virtual {v9, v7}, Ljc/a0;->b(Ljava/lang/Class;)Lpc/c;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    const/4 v10, 0x0

    .line 76
    invoke-static {v3, v7, v10, v6}, Lg8/a;->w(Landroidx/lifecycle/x0;Lpc/c;Landroidx/lifecycle/u0;Li4/b;)Landroidx/lifecycle/s0;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    move-object v7, v3

    .line 81
    check-cast v7, Lia/b;

    .line 82
    .line 83
    invoke-virtual {p1, v7}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-virtual {p1, v8}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    or-int/2addr v3, v6

    .line 92
    and-int/lit8 v0, v0, 0xe

    .line 93
    .line 94
    if-ne v0, v2, :cond_3

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    const/4 v5, 0x0

    .line 98
    :goto_3
    or-int v0, v3, v5

    .line 99
    .line 100
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    sget-object v3, Lx0/k;->a:Lx0/r0;

    .line 105
    .line 106
    if-nez v0, :cond_5

    .line 107
    .line 108
    if-ne v2, v3, :cond_4

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_4
    move-object v9, p0

    .line 112
    goto :goto_5

    .line 113
    :cond_5
    :goto_4
    new-instance v6, Lf7/o;

    .line 114
    .line 115
    const/4 v11, 0x5

    .line 116
    move-object v9, p0

    .line 117
    invoke-direct/range {v6 .. v11}, Lf7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    move-object v2, v6

    .line 124
    :goto_5
    check-cast v2, Lic/n;

    .line 125
    .line 126
    sget-object p0, Lub/a0;->a:Lub/a0;

    .line 127
    .line 128
    invoke-static {v2, p0, p1}, Lx0/v;->e(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, v7, Lia/b;->b:Lx0/e1;

    .line 132
    .line 133
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer;

    .line 138
    .line 139
    if-nez v0, :cond_6

    .line 140
    .line 141
    invoke-virtual {p1}, Lx0/o;->r()Lx0/p1;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_d

    .line 146
    .line 147
    new-instance p1, Lba/p;

    .line 148
    .line 149
    const/4 v0, 0x6

    .line 150
    invoke-direct {p1, p2, v0, v9}, Lba/p;-><init>(IILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :goto_6
    iput-object p1, p0, Lx0/p1;->d:Lic/n;

    .line 154
    .line 155
    return-void

    .line 156
    :cond_6
    const v2, 0xf0b9c4f

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v2}, Lx0/o;->X(I)V

    .line 160
    .line 161
    .line 162
    new-instance v2, Lcg/w;

    .line 163
    .line 164
    invoke-virtual {p1, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, Landroid/content/Context;

    .line 169
    .line 170
    invoke-direct {v2, v1, v0}, Lcg/w;-><init>(Landroid/content/Context;Landroidx/media3/exoplayer/ExoPlayer;)V

    .line 171
    .line 172
    .line 173
    const v0, 0x671a9c9b

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v0}, Lx0/o;->X(I)V

    .line 177
    .line 178
    .line 179
    invoke-static {p1}, Lj4/a;->a(Lx0/o;)Landroidx/lifecycle/x0;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    if-eqz v0, :cond_a

    .line 184
    .line 185
    instance-of v1, v0, Landroidx/lifecycle/k;

    .line 186
    .line 187
    if-eqz v1, :cond_7

    .line 188
    .line 189
    move-object v1, v0

    .line 190
    check-cast v1, Landroidx/lifecycle/k;

    .line 191
    .line 192
    invoke-interface {v1}, Landroidx/lifecycle/k;->c()Li4/e;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    goto :goto_7

    .line 197
    :cond_7
    sget-object v1, Li4/a;->b:Li4/a;

    .line 198
    .line 199
    :goto_7
    const-class v5, Lcg/v;

    .line 200
    .line 201
    invoke-static {v5}, Lg8/a;->H(Ljava/lang/Class;)Lpc/c;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-static {v0, v5, v2, v1}, Lg8/a;->w(Landroidx/lifecycle/x0;Lpc/c;Landroidx/lifecycle/u0;Li4/b;)Landroidx/lifecycle/s0;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {p1, v4}, Lx0/o;->p(Z)V

    .line 210
    .line 211
    .line 212
    check-cast v0, Lcg/v;

    .line 213
    .line 214
    invoke-virtual {p1, v4}, Lx0/o;->p(Z)V

    .line 215
    .line 216
    .line 217
    const/16 v1, 0x8

    .line 218
    .line 219
    invoke-static {v0, p1, v1}, Lg8/a;->d(Lcg/v;Lx0/o;I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1, v0}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    if-nez v1, :cond_8

    .line 231
    .line 232
    if-ne v2, v3, :cond_9

    .line 233
    .line 234
    :cond_8
    new-instance v2, Lcg/u;

    .line 235
    .line 236
    const/4 v1, 0x2

    .line 237
    invoke-direct {v2, v0, v10, v1}, Lcg/u;-><init>(Lcg/v;Lyb/c;I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    :cond_9
    check-cast v2, Lic/n;

    .line 244
    .line 245
    invoke-static {v2, p0, p1}, Lx0/v;->e(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 246
    .line 247
    .line 248
    sget-object p0, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 249
    .line 250
    invoke-static {p0}, Ly/d;->n(Lj1/q;)Lj1/q;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    const/16 v1, 0xc08

    .line 255
    .line 256
    invoke-static {v0, p0, p1, v1}, Landroid/support/v4/media/session/b;->d(Lcg/v;Lj1/q;Lx0/o;I)V

    .line 257
    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 261
    .line 262
    invoke-direct {p0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw p0

    .line 266
    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 267
    .line 268
    invoke-direct {p0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw p0

    .line 272
    :cond_c
    move-object v9, p0

    .line 273
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 274
    .line 275
    .line 276
    :goto_8
    invoke-virtual {p1}, Lx0/o;->r()Lx0/p1;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    if-eqz p0, :cond_d

    .line 281
    .line 282
    new-instance p1, Lba/p;

    .line 283
    .line 284
    const/4 v0, 0x7

    .line 285
    invoke-direct {p1, p2, v0, v9}, Lba/p;-><init>(IILjava/lang/String;)V

    .line 286
    .line 287
    .line 288
    goto/16 :goto_6

    .line 289
    .line 290
    :cond_d
    return-void
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
