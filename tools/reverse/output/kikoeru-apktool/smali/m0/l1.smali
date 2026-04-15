.class public final Lm0/l1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llf/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lh1/s;


# direct methods
.method public synthetic constructor <init>(Lh1/s;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm0/l1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lm0/l1;->b:Lh1/s;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public final n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p2, p0, Lm0/l1;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lw/j;

    .line 7
    .line 8
    instance-of p2, p1, Lw/m;

    .line 9
    .line 10
    iget-object v0, p0, Lm0/l1;->b:Lh1/s;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of p2, p1, Lw/n;

    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    check-cast p1, Lw/n;

    .line 23
    .line 24
    iget-object p1, p1, Lw/n;->a:Lw/m;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    instance-of p2, p1, Lw/l;

    .line 31
    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    check-cast p1, Lw/l;

    .line 35
    .line 36
    iget-object p1, p1, Lw/l;->a:Lw/m;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    instance-of p2, p1, Lw/b;

    .line 43
    .line 44
    if-eqz p2, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    instance-of p2, p1, Lw/c;

    .line 51
    .line 52
    if-eqz p2, :cond_4

    .line 53
    .line 54
    check-cast p1, Lw/c;

    .line 55
    .line 56
    iget-object p1, p1, Lw/c;->a:Lw/b;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    instance-of p2, p1, Lw/a;

    .line 63
    .line 64
    if-eqz p2, :cond_5

    .line 65
    .line 66
    check-cast p1, Lw/a;

    .line 67
    .line 68
    iget-object p1, p1, Lw/a;->a:Lw/b;

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :cond_5
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_0
    check-cast p1, Lw/j;

    .line 77
    .line 78
    instance-of p2, p1, Lw/m;

    .line 79
    .line 80
    iget-object v0, p0, Lm0/l1;->b:Lh1/s;

    .line 81
    .line 82
    if-eqz p2, :cond_6

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_6
    instance-of p2, p1, Lw/n;

    .line 89
    .line 90
    if-eqz p2, :cond_7

    .line 91
    .line 92
    check-cast p1, Lw/n;

    .line 93
    .line 94
    iget-object p1, p1, Lw/n;->a:Lw/m;

    .line 95
    .line 96
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_7
    instance-of p2, p1, Lw/l;

    .line 101
    .line 102
    if-eqz p2, :cond_8

    .line 103
    .line 104
    check-cast p1, Lw/l;

    .line 105
    .line 106
    iget-object p1, p1, Lw/l;->a:Lw/m;

    .line 107
    .line 108
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_8
    instance-of p2, p1, Lw/b;

    .line 113
    .line 114
    if-eqz p2, :cond_9

    .line 115
    .line 116
    invoke-virtual {v0, p1}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_9
    instance-of p2, p1, Lw/c;

    .line 121
    .line 122
    if-eqz p2, :cond_a

    .line 123
    .line 124
    check-cast p1, Lw/c;

    .line 125
    .line 126
    iget-object p1, p1, Lw/c;->a:Lw/b;

    .line 127
    .line 128
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_a
    instance-of p2, p1, Lw/a;

    .line 133
    .line 134
    if-eqz p2, :cond_b

    .line 135
    .line 136
    check-cast p1, Lw/a;

    .line 137
    .line 138
    iget-object p1, p1, Lw/a;->a:Lw/b;

    .line 139
    .line 140
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    :cond_b
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 144
    .line 145
    return-object p1

    .line 146
    :pswitch_1
    check-cast p1, Lw/j;

    .line 147
    .line 148
    instance-of p2, p1, Lw/m;

    .line 149
    .line 150
    iget-object v0, p0, Lm0/l1;->b:Lh1/s;

    .line 151
    .line 152
    if-eqz p2, :cond_c

    .line 153
    .line 154
    invoke-virtual {v0, p1}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_c
    instance-of p2, p1, Lw/n;

    .line 159
    .line 160
    if-eqz p2, :cond_d

    .line 161
    .line 162
    check-cast p1, Lw/n;

    .line 163
    .line 164
    iget-object p1, p1, Lw/n;->a:Lw/m;

    .line 165
    .line 166
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_d
    instance-of p2, p1, Lw/l;

    .line 171
    .line 172
    if-eqz p2, :cond_e

    .line 173
    .line 174
    check-cast p1, Lw/l;

    .line 175
    .line 176
    iget-object p1, p1, Lw/l;->a:Lw/m;

    .line 177
    .line 178
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_e
    instance-of p2, p1, Lw/b;

    .line 183
    .line 184
    if-eqz p2, :cond_f

    .line 185
    .line 186
    invoke-virtual {v0, p1}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_f
    instance-of p2, p1, Lw/c;

    .line 191
    .line 192
    if-eqz p2, :cond_10

    .line 193
    .line 194
    check-cast p1, Lw/c;

    .line 195
    .line 196
    iget-object p1, p1, Lw/c;->a:Lw/b;

    .line 197
    .line 198
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_10
    instance-of p2, p1, Lw/a;

    .line 203
    .line 204
    if-eqz p2, :cond_11

    .line 205
    .line 206
    check-cast p1, Lw/a;

    .line 207
    .line 208
    iget-object p1, p1, Lw/a;->a:Lw/b;

    .line 209
    .line 210
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    :cond_11
    :goto_2
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 214
    .line 215
    return-object p1

    .line 216
    :pswitch_2
    check-cast p1, Lw/j;

    .line 217
    .line 218
    instance-of p2, p1, Lw/h;

    .line 219
    .line 220
    iget-object v0, p0, Lm0/l1;->b:Lh1/s;

    .line 221
    .line 222
    if-eqz p2, :cond_12

    .line 223
    .line 224
    invoke-virtual {v0, p1}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_12
    instance-of p2, p1, Lw/i;

    .line 229
    .line 230
    if-eqz p2, :cond_13

    .line 231
    .line 232
    check-cast p1, Lw/i;

    .line 233
    .line 234
    iget-object p1, p1, Lw/i;->a:Lw/h;

    .line 235
    .line 236
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_13
    instance-of p2, p1, Lw/f;

    .line 241
    .line 242
    if-eqz p2, :cond_14

    .line 243
    .line 244
    invoke-virtual {v0, p1}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_14
    instance-of p2, p1, Lw/g;

    .line 249
    .line 250
    if-eqz p2, :cond_15

    .line 251
    .line 252
    check-cast p1, Lw/g;

    .line 253
    .line 254
    iget-object p1, p1, Lw/g;->a:Lw/f;

    .line 255
    .line 256
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_15
    instance-of p2, p1, Lw/m;

    .line 261
    .line 262
    if-eqz p2, :cond_16

    .line 263
    .line 264
    invoke-virtual {v0, p1}, Lh1/s;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_16
    instance-of p2, p1, Lw/n;

    .line 269
    .line 270
    if-eqz p2, :cond_17

    .line 271
    .line 272
    check-cast p1, Lw/n;

    .line 273
    .line 274
    iget-object p1, p1, Lw/n;->a:Lw/m;

    .line 275
    .line 276
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_17
    instance-of p2, p1, Lw/l;

    .line 281
    .line 282
    if-eqz p2, :cond_18

    .line 283
    .line 284
    check-cast p1, Lw/l;

    .line 285
    .line 286
    iget-object p1, p1, Lw/l;->a:Lw/m;

    .line 287
    .line 288
    invoke-virtual {v0, p1}, Lh1/s;->remove(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    :cond_18
    :goto_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 292
    .line 293
    return-object p1

    .line 294
    nop

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
