.class public final synthetic Lda/p;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lda/m0;


# direct methods
.method public synthetic constructor <init>(Lda/m0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lda/p;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lda/p;->b:Lda/m0;

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
.method public final b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lda/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lba/f1;

    .line 7
    .line 8
    iget-object v1, p0, Lda/p;->b:Lda/m0;

    .line 9
    .line 10
    invoke-static {v1}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "MUSIC_PAGE_NEIGHBORS"

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Lba/f1;-><init>(Lk4/a;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lda/p;->b:Lda/m0;

    .line 26
    .line 27
    invoke-virtual {v1}, Lda/m0;->z()Lda/b;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v0, v2}, Lda/m0;->a0(Ljava/util/ArrayList;Lda/b;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    const v0, 0x7f0c015c

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lna/q;->g(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v5, 0x0

    .line 48
    const/16 v6, 0x1ff

    .line 49
    .line 50
    const-wide/16 v2, 0x0

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-static/range {v1 .. v6}, Lka/n;->c(Ljava/io/Serializable;JLic/k;Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object v2, Lh9/d;->a:Lx0/e1;

    .line 58
    .line 59
    invoke-virtual {v1}, Lda/m0;->A()Lbg/a2;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v2, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    sget-object v1, Lh9/d;->c:Lh1/s;

    .line 67
    .line 68
    invoke-virtual {v1}, Lh1/s;->clear()V

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v0}, Lvb/m;->P(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    invoke-static {v0}, Lh9/d;->e(I)V

    .line 76
    .line 77
    .line 78
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_1
    iget-object v0, p0, Lda/p;->b:Lda/m0;

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    invoke-virtual {v0, v1}, Lda/m0;->c0(Z)V

    .line 85
    .line 86
    .line 87
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_2
    iget-object v0, p0, Lda/p;->b:Lda/m0;

    .line 91
    .line 92
    iget-object v0, v0, Lda/m0;->g:Lx0/e1;

    .line 93
    .line 94
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_3
    invoke-static {}, Lg9/a;->b()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_1

    .line 107
    .line 108
    iget-object v0, p0, Lda/p;->b:Lda/m0;

    .line 109
    .line 110
    iget-object v0, v0, Lda/m0;->h:Lx0/e1;

    .line 111
    .line 112
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_1
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 118
    .line 119
    return-object v0

    .line 120
    :pswitch_4
    iget-object v0, p0, Lda/p;->b:Lda/m0;

    .line 121
    .line 122
    invoke-virtual {v0}, Lda/m0;->e0()V

    .line 123
    .line 124
    .line 125
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 126
    .line 127
    return-object v0

    .line 128
    :pswitch_5
    iget-object v0, p0, Lda/p;->b:Lda/m0;

    .line 129
    .line 130
    invoke-virtual {v0}, Lda/m0;->z()Lda/b;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-object v0, v0, Lda/b;->a:Ljava/util/List;

    .line 135
    .line 136
    check-cast v0, Ljava/lang/Iterable;

    .line 137
    .line 138
    instance-of v1, v0, Ljava/util/Collection;

    .line 139
    .line 140
    if-eqz v1, :cond_2

    .line 141
    .line 142
    move-object v1, v0

    .line 143
    check-cast v1, Ljava/util/Collection;

    .line 144
    .line 145
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_2

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_4

    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, Ls2/a;

    .line 167
    .line 168
    sget-object v2, Ls2/a;->b:Ls2/a;

    .line 169
    .line 170
    if-eq v1, v2, :cond_3

    .line 171
    .line 172
    const/4 v0, 0x1

    .line 173
    goto :goto_2

    .line 174
    :cond_4
    :goto_1
    const/4 v0, 0x0

    .line 175
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    return-object v0

    .line 180
    :pswitch_6
    iget-object v0, p0, Lda/p;->b:Lda/m0;

    .line 181
    .line 182
    invoke-virtual {v0}, Lda/m0;->A()Lbg/a2;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    if-eqz v0, :cond_6

    .line 187
    .line 188
    iget-object v1, v0, Lbg/a2;->m:Ljava/lang/String;

    .line 189
    .line 190
    if-nez v1, :cond_5

    .line 191
    .line 192
    iget-object v1, v0, Lbg/a2;->w:Ljava/lang/Integer;

    .line 193
    .line 194
    if-nez v1, :cond_5

    .line 195
    .line 196
    iget-object v0, v0, Lbg/a2;->t:Ljava/lang/String;

    .line 197
    .line 198
    if-eqz v0, :cond_6

    .line 199
    .line 200
    :cond_5
    const/4 v0, 0x1

    .line 201
    goto :goto_3

    .line 202
    :cond_6
    const/4 v0, 0x0

    .line 203
    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    return-object v0

    .line 208
    :pswitch_7
    iget-object v0, p0, Lda/p;->b:Lda/m0;

    .line 209
    .line 210
    invoke-virtual {v0}, Lda/m0;->z()Lda/b;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    iget-object v2, v1, Lda/b;->a:Ljava/util/List;

    .line 215
    .line 216
    check-cast v2, Ljava/lang/Iterable;

    .line 217
    .line 218
    instance-of v3, v2, Ljava/util/Collection;

    .line 219
    .line 220
    if-eqz v3, :cond_7

    .line 221
    .line 222
    move-object v3, v2

    .line 223
    check-cast v3, Ljava/util/Collection;

    .line 224
    .line 225
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    if-eqz v3, :cond_7

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_7
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-eqz v3, :cond_a

    .line 241
    .line 242
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    check-cast v3, Ls2/a;

    .line 247
    .line 248
    sget-object v4, Ls2/a;->a:Ls2/a;

    .line 249
    .line 250
    if-ne v3, v4, :cond_8

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_8
    iget-object v0, v1, Lda/b;->d:Ljava/util/List;

    .line 254
    .line 255
    check-cast v0, Ljava/lang/Iterable;

    .line 256
    .line 257
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    const/4 v2, 0x0

    .line 262
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    if-eqz v3, :cond_b

    .line 267
    .line 268
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    add-int/lit8 v5, v2, 0x1

    .line 273
    .line 274
    if-ltz v2, :cond_9

    .line 275
    .line 276
    check-cast v3, Lbg/o0;

    .line 277
    .line 278
    invoke-static {v1, v2, v4}, Lda/m0;->T(Lda/b;ILs2/a;)V

    .line 279
    .line 280
    .line 281
    move v2, v5

    .line 282
    goto :goto_5

    .line 283
    :cond_9
    invoke-static {}, Lud/b;->H()V

    .line 284
    .line 285
    .line 286
    const/4 v0, 0x0

    .line 287
    throw v0

    .line 288
    :cond_a
    :goto_6
    invoke-virtual {v0}, Lda/m0;->e0()V

    .line 289
    .line 290
    .line 291
    :cond_b
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 292
    .line 293
    return-object v0

    .line 294
    :pswitch_8
    iget-object v0, p0, Lda/p;->b:Lda/m0;

    .line 295
    .line 296
    iget-object v0, v0, Lda/m0;->f:Lx0/e1;

    .line 297
    .line 298
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 299
    .line 300
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 304
    .line 305
    return-object v0

    .line 306
    :pswitch_9
    iget-object v0, p0, Lda/p;->b:Lda/m0;

    .line 307
    .line 308
    const/4 v1, 0x0

    .line 309
    invoke-virtual {v0, v1}, Lda/m0;->c0(Z)V

    .line 310
    .line 311
    .line 312
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 313
    .line 314
    return-object v0

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
