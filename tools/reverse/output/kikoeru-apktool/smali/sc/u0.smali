.class public final Lsc/u0;
.super Ljava/lang/Object;

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final b:Lsc/w0;


# direct methods
.method public synthetic constructor <init>(Lsc/w0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsc/u0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lsc/u0;->b:Lsc/w0;

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
    .locals 12

    .line 1
    iget v0, p0, Lsc/u0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsc/u0;->b:Lsc/w0;

    .line 7
    .line 8
    iget-object v0, v0, Lsc/w0;->c:Lsc/z1;

    .line 9
    .line 10
    sget-object v1, Lsc/w0;->g:[Lpc/u;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aget-object v1, v1, v2

    .line 14
    .line 15
    invoke-virtual {v0}, Lsc/z1;->b()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ldd/c;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Ldd/c;->b:Li5/f;

    .line 24
    .line 25
    iget-object v1, v0, Li5/f;->e:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, [Ljava/lang/String;

    .line 28
    .line 29
    iget-object v2, v0, Li5/f;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, [Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-static {v1, v2}, Lae/g;->h([Ljava/lang/String;[Ljava/lang/String;)Lub/k;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, v1, Lub/k;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Lae/f;

    .line 44
    .line 45
    iget-object v1, v1, Lub/k;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lwd/f0;

    .line 48
    .line 49
    new-instance v3, Lub/q;

    .line 50
    .line 51
    iget-object v0, v0, Li5/f;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lyd/e;

    .line 54
    .line 55
    invoke-direct {v3, v2, v1, v0}, Lub/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/4 v3, 0x0

    .line 60
    :goto_0
    return-object v3

    .line 61
    :pswitch_0
    iget-object v0, p0, Lsc/u0;->b:Lsc/w0;

    .line 62
    .line 63
    iget-object v1, v0, Lsc/w0;->c:Lsc/z1;

    .line 64
    .line 65
    sget-object v2, Lsc/w0;->g:[Lpc/u;

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    aget-object v2, v2, v3

    .line 69
    .line 70
    invoke-virtual {v1}, Lsc/z1;->b()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Ldd/c;

    .line 75
    .line 76
    if-eqz v1, :cond_b

    .line 77
    .line 78
    iget-object v0, v0, Lsc/f0;->a:Lsc/z1;

    .line 79
    .line 80
    sget-object v2, Lsc/f0;->b:[Lpc/u;

    .line 81
    .line 82
    aget-object v2, v2, v3

    .line 83
    .line 84
    invoke-virtual {v0}, Lsc/z1;->b()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v2, "getValue(...)"

    .line 89
    .line 90
    invoke-static {v0, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    check-cast v0, Ldd/f;

    .line 94
    .line 95
    iget-object v0, v0, Ldd/f;->b:Lc7/e1;

    .line 96
    .line 97
    iget-object v2, v0, Lc7/e1;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Lud/g;

    .line 100
    .line 101
    iget-object v3, v0, Lc7/e1;->d:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 104
    .line 105
    iget-object v4, v1, Ldd/c;->a:Ljava/lang/Class;

    .line 106
    .line 107
    invoke-static {v4}, Led/d;->a(Ljava/lang/Class;)Lbe/b;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {v3, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    if-nez v6, :cond_a

    .line 116
    .line 117
    invoke-static {v4}, Led/d;->a(Ljava/lang/Class;)Lbe/b;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    iget-object v4, v4, Lbe/b;->a:Lbe/c;

    .line 122
    .line 123
    iget-object v6, v1, Ldd/c;->b:Li5/f;

    .line 124
    .line 125
    iget-object v7, v6, Li5/f;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v7, Lvd/a;

    .line 128
    .line 129
    sget-object v8, Lvd/a;->h:Lvd/a;

    .line 130
    .line 131
    if-ne v7, v8, :cond_5

    .line 132
    .line 133
    iget-object v6, v6, Li5/f;->e:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v6, [Ljava/lang/String;

    .line 136
    .line 137
    const/4 v9, 0x0

    .line 138
    if-ne v7, v8, :cond_1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_1
    move-object v6, v9

    .line 142
    :goto_1
    if-eqz v6, :cond_2

    .line 143
    .line 144
    invoke-static {v6}, Lvb/l;->c0([Ljava/lang/Object;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    :cond_2
    if-nez v9, :cond_3

    .line 149
    .line 150
    sget-object v9, Lvb/r;->a:Lvb/r;

    .line 151
    .line 152
    :cond_3
    check-cast v9, Ljava/lang/Iterable;

    .line 153
    .line 154
    new-instance v6, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    :cond_4
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-eqz v8, :cond_6

    .line 168
    .line 169
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    check-cast v8, Ljava/lang/String;

    .line 174
    .line 175
    invoke-static {v8}, Lje/b;->c(Ljava/lang/String;)Lje/b;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    new-instance v9, Lbe/c;

    .line 180
    .line 181
    iget-object v8, v8, Lje/b;->a:Ljava/lang/String;

    .line 182
    .line 183
    const/16 v10, 0x2f

    .line 184
    .line 185
    const/16 v11, 0x2e

    .line 186
    .line 187
    invoke-virtual {v8, v10, v11}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    invoke-direct {v9, v8}, Lbe/c;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    new-instance v8, Lbe/b;

    .line 195
    .line 196
    invoke-virtual {v9}, Lbe/c;->b()Lbe/c;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    iget-object v9, v9, Lbe/c;->a:Lbe/d;

    .line 201
    .line 202
    invoke-virtual {v9}, Lbe/d;->g()Lbe/e;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    invoke-direct {v8, v10, v9}, Lbe/b;-><init>(Lbe/c;Lbe/e;)V

    .line 207
    .line 208
    .line 209
    iget-object v9, v0, Lc7/e1;->c:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v9, Ldd/b;

    .line 212
    .line 213
    invoke-virtual {v2}, Lud/g;->c()Loe/i;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    iget-object v10, v10, Loe/i;->c:Loe/j;

    .line 218
    .line 219
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    sget-object v10, Lyd/e;->g:Lyd/e;

    .line 223
    .line 224
    invoke-static {v9, v8, v10}, Lud/n;->i(Ldd/b;Lbe/b;Lyd/e;)Ldd/c;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    if-eqz v8, :cond_4

    .line 229
    .line 230
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_5
    invoke-static {v1}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    :cond_6
    new-instance v0, Lbd/r;

    .line 239
    .line 240
    invoke-virtual {v2}, Lud/g;->c()Loe/i;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    iget-object v7, v7, Loe/i;->b:Lyc/y;

    .line 245
    .line 246
    const/4 v8, 0x0

    .line 247
    invoke-direct {v0, v7, v4, v8}, Lbd/r;-><init>(Lyc/y;Lbe/c;I)V

    .line 248
    .line 249
    .line 250
    check-cast v6, Ljava/lang/Iterable;

    .line 251
    .line 252
    new-instance v7, Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    :cond_7
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v8

    .line 265
    if-eqz v8, :cond_8

    .line 266
    .line 267
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    check-cast v8, Ldd/c;

    .line 272
    .line 273
    invoke-virtual {v2, v0, v8}, Lud/g;->a(Lyc/d0;Ldd/c;)Lqe/p;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    if-eqz v8, :cond_7

    .line 278
    .line 279
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_8
    invoke-static {v7}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    new-instance v2, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    const-string v6, "package "

    .line 290
    .line 291
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string v4, " ("

    .line 298
    .line 299
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    const/16 v1, 0x29

    .line 306
    .line 307
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    check-cast v0, Ljava/lang/Iterable;

    .line 315
    .line 316
    invoke-static {v1, v0}, Llc/b;->p(Ljava/lang/String;Ljava/lang/Iterable;)Lle/o;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-virtual {v3, v5, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    if-nez v1, :cond_9

    .line 325
    .line 326
    move-object v6, v0

    .line 327
    goto :goto_4

    .line 328
    :cond_9
    move-object v6, v1

    .line 329
    :cond_a
    :goto_4
    const-string v0, "getOrPut(...)"

    .line 330
    .line 331
    invoke-static {v6, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    check-cast v6, Lle/o;

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_b
    sget-object v6, Lle/n;->b:Lle/n;

    .line 338
    .line 339
    :goto_5
    return-object v6

    .line 340
    nop

    .line 341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method
