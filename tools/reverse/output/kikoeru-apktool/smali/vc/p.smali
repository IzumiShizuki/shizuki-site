.class public abstract Lvc/p;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lbd/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lbd/i0;

    .line 2
    .line 3
    new-instance v1, Lbd/r;

    .line 4
    .line 5
    sget-object v2, Lue/l;->a:Lue/l;

    .line 6
    .line 7
    sget-object v2, Lue/l;->b:Lue/e;

    .line 8
    .line 9
    sget-object v3, Lvc/o;->f:Lbe/c;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v1, v2, v3, v4}, Lbd/r;-><init>(Lyc/y;Lbe/c;I)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Lvc/o;->g:Lbe/c;

    .line 16
    .line 17
    iget-object v2, v2, Lbe/c;->a:Lbe/d;

    .line 18
    .line 19
    invoke-virtual {v2}, Lbe/d;->g()Lbe/e;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Lre/l;->e:Lre/b;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3}, Lbd/i0;-><init>(Lbd/r;Lbe/e;Lre/o;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, Lyc/x;->e:Lyc/x;

    .line 29
    .line 30
    iput-object v1, v0, Lbd/i0;->h:Lyc/x;

    .line 31
    .line 32
    sget-object v1, Lyc/o;->e:Lld/o;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    iput-object v1, v0, Lbd/i0;->i:Lld/o;

    .line 38
    .line 39
    const-string v1, "T"

    .line 40
    .line 41
    invoke-static {v1}, Lbe/e;->e(Ljava/lang/String;)Lbe/e;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v5, Lse/x0;->d:Lse/x0;

    .line 46
    .line 47
    invoke-static {v0, v5, v1, v4, v3}, Lbd/w0;->G1(Lbd/c;Lse/x0;Lbe/e;ILre/o;)Lbd/w0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, Lud/b;->w(Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v3, v0, Lbd/i0;->k:Ljava/util/ArrayList;

    .line 56
    .line 57
    if-nez v3, :cond_2

    .line 58
    .line 59
    new-instance v3, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 62
    .line 63
    .line 64
    iput-object v3, v0, Lbd/i0;->k:Ljava/util/ArrayList;

    .line 65
    .line 66
    new-instance v1, Lse/i;

    .line 67
    .line 68
    iget-object v4, v0, Lbd/i0;->l:Ljava/util/ArrayList;

    .line 69
    .line 70
    iget-object v5, v0, Lbd/i0;->m:Lre/o;

    .line 71
    .line 72
    invoke-direct {v1, v0, v3, v4, v5}, Lse/i;-><init>(Lbd/e0;Ljava/util/List;Ljava/util/Collection;Lre/o;)V

    .line 73
    .line 74
    .line 75
    iput-object v1, v0, Lbd/i0;->j:Lse/i;

    .line 76
    .line 77
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 78
    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_0

    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Lyc/t;

    .line 96
    .line 97
    check-cast v2, Lbd/l;

    .line 98
    .line 99
    invoke-virtual {v0}, Lbd/c;->E()Lse/a0;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    iput-object v3, v2, Lbd/z;->g:Lse/w;

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    sput-object v0, Lvc/p;->a:Lbd/i0;

    .line 107
    .line 108
    return-void

    .line 109
    :cond_1
    const/16 v0, 0xd

    .line 110
    .line 111
    invoke-static {v0}, Lbd/i0;->k(I)V

    .line 112
    .line 113
    .line 114
    throw v2

    .line 115
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 116
    .line 117
    new-instance v2, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v3, "Type parameters are already set for "

    .line 120
    .line 121
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lbd/c;->getName()Lbe/e;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v1

    .line 139
    :cond_3
    const/16 v0, 0x9

    .line 140
    .line 141
    invoke-static {v0}, Lbd/i0;->k(I)V

    .line 142
    .line 143
    .line 144
    throw v2
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
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
.end method
