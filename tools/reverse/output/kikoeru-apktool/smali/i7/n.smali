.class public final Li7/n;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llf/f;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li7/n;->a:I

    iput-object p2, p0, Li7/n;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lic/n;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Li7/n;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    check-cast p1, Lac/i;

    iput-object p1, p0, Li7/n;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Llf/g;Lyb/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Li7/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb0/x;

    .line 7
    .line 8
    iget-object v1, p0, Li7/n;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Llf/k;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/16 v3, 0x1b

    .line 14
    .line 15
    invoke-direct {v0, v1, p1, v2, v3}, Lb0/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lhf/s1;

    .line 19
    .line 20
    invoke-interface {p2}, Lyb/c;->s()Lyb/h;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {p1, v1, p2, v2}, Lhf/s1;-><init>(Lyb/h;Lyb/c;I)V

    .line 26
    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-static {p1, p2, p1, v0}, Lnd/h;->v(Lnf/q;ZLnf/q;Lic/n;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 34
    .line 35
    if-ne p1, p2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 39
    .line 40
    :goto_0
    return-object p1

    .line 41
    :pswitch_0
    iget-object v0, p0, Li7/n;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Li7/n;

    .line 44
    .line 45
    new-instance v1, Li7/g;

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    invoke-direct {v1, p1, v2}, Li7/g;-><init>(Llf/g;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1, p2}, Li7/n;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 56
    .line 57
    if-ne p1, p2, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 61
    .line 62
    :goto_1
    return-object p1

    .line 63
    :pswitch_1
    instance-of v0, p2, Llf/a;

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    move-object v0, p2

    .line 68
    check-cast v0, Llf/a;

    .line 69
    .line 70
    iget v1, v0, Llf/a;->g:I

    .line 71
    .line 72
    const/high16 v2, -0x80000000

    .line 73
    .line 74
    and-int v3, v1, v2

    .line 75
    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    sub-int/2addr v1, v2

    .line 79
    iput v1, v0, Llf/a;->g:I

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    new-instance v0, Llf/a;

    .line 83
    .line 84
    invoke-direct {v0, p0, p2}, Llf/a;-><init>(Li7/n;Lyb/c;)V

    .line 85
    .line 86
    .line 87
    :goto_2
    iget-object p2, v0, Llf/a;->e:Ljava/lang/Object;

    .line 88
    .line 89
    iget v1, v0, Llf/a;->g:I

    .line 90
    .line 91
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 92
    .line 93
    const/4 v3, 0x1

    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    if-ne v1, v3, :cond_3

    .line 97
    .line 98
    iget-object p1, v0, Llf/a;->d:Lmf/p;

    .line 99
    .line 100
    :try_start_0
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    .line 103
    goto :goto_4

    .line 104
    :catchall_0
    move-exception p2

    .line 105
    goto :goto_7

    .line 106
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 109
    .line 110
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :cond_4
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    new-instance p2, Lmf/p;

    .line 118
    .line 119
    iget-object v1, v0, Lac/c;->b:Lyb/h;

    .line 120
    .line 121
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {p2, p1, v1}, Lmf/p;-><init>(Llf/g;Lyb/h;)V

    .line 125
    .line 126
    .line 127
    :try_start_1
    iput-object p2, v0, Llf/a;->d:Lmf/p;

    .line 128
    .line 129
    iput v3, v0, Llf/a;->g:I

    .line 130
    .line 131
    iget-object p1, p0, Li7/n;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p1, Lac/i;

    .line 134
    .line 135
    invoke-interface {p1, p2, v0}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 139
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 140
    .line 141
    if-ne p1, v0, :cond_5

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_5
    move-object p1, v2

    .line 145
    :goto_3
    if-ne p1, v0, :cond_6

    .line 146
    .line 147
    move-object v2, v0

    .line 148
    goto :goto_5

    .line 149
    :cond_6
    move-object p1, p2

    .line 150
    :goto_4
    invoke-virtual {p1}, Lac/c;->w()V

    .line 151
    .line 152
    .line 153
    :goto_5
    return-object v2

    .line 154
    :goto_6
    move-object v6, p2

    .line 155
    move-object p2, p1

    .line 156
    move-object p1, v6

    .line 157
    goto :goto_7

    .line 158
    :catchall_1
    move-exception p1

    .line 159
    goto :goto_6

    .line 160
    :goto_7
    invoke-virtual {p1}, Lac/c;->w()V

    .line 161
    .line 162
    .line 163
    throw p2

    .line 164
    :pswitch_2
    instance-of v0, p2, Llf/h;

    .line 165
    .line 166
    if-eqz v0, :cond_7

    .line 167
    .line 168
    move-object v0, p2

    .line 169
    check-cast v0, Llf/h;

    .line 170
    .line 171
    iget v1, v0, Llf/h;->e:I

    .line 172
    .line 173
    const/high16 v2, -0x80000000

    .line 174
    .line 175
    and-int v3, v1, v2

    .line 176
    .line 177
    if-eqz v3, :cond_7

    .line 178
    .line 179
    sub-int/2addr v1, v2

    .line 180
    iput v1, v0, Llf/h;->e:I

    .line 181
    .line 182
    goto :goto_8

    .line 183
    :cond_7
    new-instance v0, Llf/h;

    .line 184
    .line 185
    invoke-direct {v0, p0, p2}, Llf/h;-><init>(Li7/n;Lyb/c;)V

    .line 186
    .line 187
    .line 188
    :goto_8
    iget-object p2, v0, Llf/h;->d:Ljava/lang/Object;

    .line 189
    .line 190
    iget v1, v0, Llf/h;->e:I

    .line 191
    .line 192
    const/4 v2, 0x1

    .line 193
    if-eqz v1, :cond_9

    .line 194
    .line 195
    if-ne v1, v2, :cond_8

    .line 196
    .line 197
    iget p1, v0, Llf/h;->j:I

    .line 198
    .line 199
    iget v1, v0, Llf/h;->i:I

    .line 200
    .line 201
    iget-object v3, v0, Llf/h;->h:Llf/g;

    .line 202
    .line 203
    iget-object v4, v0, Llf/h;->g:Li7/n;

    .line 204
    .line 205
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    move-object p2, v3

    .line 209
    goto :goto_a

    .line 210
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 211
    .line 212
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 213
    .line 214
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p1

    .line 218
    :cond_9
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    iget-object p2, p0, Li7/n;->b:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p2, [Ljava/lang/Object;

    .line 224
    .line 225
    array-length p2, p2

    .line 226
    const/4 v1, 0x0

    .line 227
    move v4, p2

    .line 228
    move-object p2, p1

    .line 229
    move p1, v4

    .line 230
    move-object v4, p0

    .line 231
    :goto_9
    if-ge v1, p1, :cond_b

    .line 232
    .line 233
    iget-object v3, v4, Li7/n;->b:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v3, [Ljava/lang/Object;

    .line 236
    .line 237
    aget-object v3, v3, v1

    .line 238
    .line 239
    iput-object v4, v0, Llf/h;->g:Li7/n;

    .line 240
    .line 241
    iput-object p2, v0, Llf/h;->h:Llf/g;

    .line 242
    .line 243
    iput v1, v0, Llf/h;->i:I

    .line 244
    .line 245
    iput p1, v0, Llf/h;->j:I

    .line 246
    .line 247
    iput v2, v0, Llf/h;->e:I

    .line 248
    .line 249
    invoke-interface {p2, v3, v0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    sget-object v5, Lzb/a;->a:Lzb/a;

    .line 254
    .line 255
    if-ne v3, v5, :cond_a

    .line 256
    .line 257
    goto :goto_b

    .line 258
    :cond_a
    :goto_a
    add-int/2addr v1, v2

    .line 259
    goto :goto_9

    .line 260
    :cond_b
    sget-object v5, Lub/a0;->a:Lub/a0;

    .line 261
    .line 262
    :goto_b
    return-object v5

    .line 263
    :pswitch_3
    iget-object v0, p0, Li7/n;->b:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Llf/b1;

    .line 266
    .line 267
    new-instance v1, Li7/g;

    .line 268
    .line 269
    const/4 v2, 0x1

    .line 270
    invoke-direct {v1, p1, v2}, Li7/g;-><init>(Llf/g;I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v1, p2}, Llf/b1;->b(Llf/g;Lyb/c;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    sget-object p1, Lzb/a;->a:Lzb/a;

    .line 277
    .line 278
    return-object p1

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
