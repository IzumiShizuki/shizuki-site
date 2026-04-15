.class public abstract Lja/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lm0/b1;

.field public static final b:Lm0/b1;

.field public static c:Lx0/p1;


# direct methods
.method static constructor <clinit>()V
    .locals 26

    .line 1
    sget-wide v1, Lja/a;->b:J

    .line 2
    .line 3
    sget-wide v3, Lja/a;->d:J

    .line 4
    .line 5
    sget-wide v5, Lja/a;->e:J

    .line 6
    .line 7
    sget-object v0, Lm0/c1;->a:Lx0/o2;

    .line 8
    .line 9
    const-wide v7, 0xff121212L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v7, v8}, Lq1/h0;->e(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v9

    .line 18
    invoke-static {v7, v8}, Lq1/h0;->e(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v11

    .line 22
    const-wide v7, 0xffcf6679L

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v7, v8}, Lq1/h0;->e(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v13

    .line 31
    sget-wide v15, Lq1/q;->b:J

    .line 32
    .line 33
    sget-wide v19, Lq1/q;->d:J

    .line 34
    .line 35
    new-instance v0, Lm0/b1;

    .line 36
    .line 37
    const/16 v25, 0x0

    .line 38
    .line 39
    move-wide v7, v5

    .line 40
    move-wide/from16 v17, v15

    .line 41
    .line 42
    move-wide/from16 v21, v19

    .line 43
    .line 44
    move-wide/from16 v23, v15

    .line 45
    .line 46
    invoke-direct/range {v0 .. v25}, Lm0/b1;-><init>(JJJJJJJJJJJJZ)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lja/d;->a:Lm0/b1;

    .line 50
    .line 51
    move-wide v5, v3

    .line 52
    sget-wide v3, Lja/a;->c:J

    .line 53
    .line 54
    const/16 v9, 0xff8

    .line 55
    .line 56
    invoke-static/range {v3 .. v9}, Lm0/c1;->d(JJJI)Lm0/b1;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sput-object v0, Lja/d;->b:Lm0/b1;

    .line 61
    .line 62
    return-void
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

.method public static final a(ZLx0/o;I)V
    .locals 6

    .line 1
    const v0, 0x7c90e054

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 5
    .line 6
    .line 7
    or-int/lit8 v0, p2, 0x2

    .line 8
    .line 9
    and-int/lit8 v1, v0, 0x13

    .line 10
    .line 11
    const/16 v2, 0x12

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eq v1, v2, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    and-int/2addr v0, v4

    .line 21
    invoke-virtual {p1, v0, v1}, Lx0/o;->N(IZ)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_a

    .line 26
    .line 27
    invoke-virtual {p1}, Lx0/o;->S()V

    .line 28
    .line 29
    .line 30
    and-int/lit8 v0, p2, 0x1

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Lx0/o;->x()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    :goto_1
    sget-object p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lx0/z;

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Landroid/content/res/Configuration;

    .line 52
    .line 53
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 54
    .line 55
    and-int/lit8 p0, p0, 0x30

    .line 56
    .line 57
    const/16 v0, 0x20

    .line 58
    .line 59
    if-ne p0, v0, :cond_3

    .line 60
    .line 61
    const/4 p0, 0x1

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    const/4 p0, 0x0

    .line 64
    :goto_2
    invoke-virtual {p1}, Lx0/o;->q()V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-class v1, Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v1}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v2, "darkTheme"

    .line 78
    .line 79
    const-string v5, "auto"

    .line 80
    .line 81
    invoke-static {v0, v2, v5, v1}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lhg/b;->a()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {p1}, Lx0/v;->r(Lx0/o;)Lx0/p1;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    sput-object v1, Lja/d;->c:Lx0/p1;

    .line 96
    .line 97
    const-string v1, "day"

    .line 98
    .line 99
    invoke-static {v0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_4

    .line 104
    .line 105
    :goto_3
    const/4 v3, 0x1

    .line 106
    goto :goto_4

    .line 107
    :cond_4
    const-string v1, "night"

    .line 108
    .line 109
    invoke-static {v0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_5
    if-nez p0, :cond_6

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    :goto_4
    if-eqz v3, :cond_7

    .line 120
    .line 121
    sget-object v0, Lja/d;->b:Lm0/b1;

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_7
    sget-object v0, Lja/d;->a:Lm0/b1;

    .line 125
    .line 126
    :goto_5
    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lx0/o2;

    .line 127
    .line 128
    invoke-virtual {p1, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const-string v2, "null cannot be cast to non-null type android.app.Activity"

    .line 133
    .line 134
    invoke-static {v1, v2}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    check-cast v1, Landroid/app/Activity;

    .line 138
    .line 139
    invoke-virtual {p1, v1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-virtual {p1, v3}, Lx0/o;->g(Z)Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    or-int/2addr v2, v4

    .line 148
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-nez v2, :cond_8

    .line 153
    .line 154
    sget-object v2, Lx0/k;->a:Lx0/r0;

    .line 155
    .line 156
    if-ne v4, v2, :cond_9

    .line 157
    .line 158
    :cond_8
    new-instance v4, Lcg/t;

    .line 159
    .line 160
    const/4 v2, 0x0

    .line 161
    const/4 v5, 0x2

    .line 162
    invoke-direct {v4, v1, v3, v2, v5}, Lcg/t;-><init>(Ljava/lang/Object;ZLyb/c;I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v4}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_9
    check-cast v4, Lic/n;

    .line 169
    .line 170
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 171
    .line 172
    invoke-static {v4, v1, p1}, Lx0/v;->e(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 173
    .line 174
    .line 175
    sget-object v1, Lja/e;->a:Lm0/d9;

    .line 176
    .line 177
    sget-object v2, Lja/b;->a:Lm0/y5;

    .line 178
    .line 179
    const/16 v3, 0xdb0

    .line 180
    .line 181
    invoke-static {v0, v1, v2, p1, v3}, Lgh/g;->e(Lm0/b1;Lm0/d9;Lm0/y5;Lx0/o;I)V

    .line 182
    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_a
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 186
    .line 187
    .line 188
    :goto_6
    invoke-virtual {p1}, Lx0/o;->r()Lx0/p1;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    if-eqz p1, :cond_b

    .line 193
    .line 194
    new-instance v0, Lja/c;

    .line 195
    .line 196
    invoke-direct {v0, p2, p0}, Lja/c;-><init>(IZ)V

    .line 197
    .line 198
    .line 199
    iput-object v0, p1, Lx0/p1;->d:Lic/n;

    .line 200
    .line 201
    :cond_b
    return-void
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
