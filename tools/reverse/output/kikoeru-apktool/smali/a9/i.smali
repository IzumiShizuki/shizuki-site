.class public abstract La9/i;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final synthetic a:[Lpc/u;

.field public static final b:Lub/p;

.field public static final c:Lhg/b;

.field public static final d:Lub/p;

.field public static final e:Lhg/b;

.field public static final f:Lub/p;

.field public static final g:Lub/p;

.field public static final h:Lhg/b;

.field public static final i:Lub/p;

.field public static final j:Lub/p;

.field public static final k:Lub/p;

.field public static final l:Lub/p;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ljc/r;

    .line 2
    .line 3
    const-class v1, La9/i;

    .line 4
    .line 5
    const-string v2, "token"

    .line 6
    .line 7
    const-string v3, "getToken()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Ljc/r;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Ljc/z;->a:Ljc/a0;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljc/a0;->f(Ljc/r;)Lpc/r;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v3, Ljc/r;

    .line 20
    .line 21
    const-string v5, "recommenderUuid"

    .line 22
    .line 23
    const-string v6, "getRecommenderUuid()Ljava/lang/String;"

    .line 24
    .line 25
    invoke-direct {v3, v1, v5, v6, v4}, Ljc/r;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljc/a0;->f(Ljc/r;)Lpc/r;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v5, Ljc/r;

    .line 33
    .line 34
    const-string v6, "forceSoftware"

    .line 35
    .line 36
    const-string v7, "getForceSoftware()Z"

    .line 37
    .line 38
    invoke-direct {v5, v1, v6, v7, v4}, Ljc/r;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v5}, Ljc/a0;->f(Ljc/r;)Lpc/r;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/4 v2, 0x3

    .line 46
    new-array v5, v2, [Lpc/u;

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    aput-object v0, v5, v6

    .line 50
    .line 51
    aput-object v3, v5, v4

    .line 52
    .line 53
    const/4 v0, 0x2

    .line 54
    aput-object v1, v5, v0

    .line 55
    .line 56
    sput-object v5, La9/i;->a:[Lpc/u;

    .line 57
    .line 58
    new-instance v0, La9/g;

    .line 59
    .line 60
    invoke-direct {v0, v6}, La9/g;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, La9/i;->b:Lub/p;

    .line 68
    .line 69
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Lhg/b;

    .line 74
    .line 75
    sput-object v0, La9/i;->c:Lhg/b;

    .line 76
    .line 77
    new-instance v0, La9/g;

    .line 78
    .line 79
    invoke-direct {v0, v2}, La9/g;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sput-object v0, La9/i;->d:Lub/p;

    .line 87
    .line 88
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lhg/b;

    .line 93
    .line 94
    sput-object v0, La9/i;->e:Lhg/b;

    .line 95
    .line 96
    new-instance v0, La9/g;

    .line 97
    .line 98
    const/4 v1, 0x4

    .line 99
    invoke-direct {v0, v1}, La9/g;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sput-object v0, La9/i;->f:Lub/p;

    .line 107
    .line 108
    new-instance v0, La9/g;

    .line 109
    .line 110
    const/4 v1, 0x5

    .line 111
    invoke-direct {v0, v1}, La9/g;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sput-object v0, La9/i;->g:Lub/p;

    .line 119
    .line 120
    new-instance v0, La9/g;

    .line 121
    .line 122
    const/4 v1, 0x6

    .line 123
    invoke-direct {v0, v1}, La9/g;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Lhg/b;

    .line 135
    .line 136
    sput-object v0, La9/i;->h:Lhg/b;

    .line 137
    .line 138
    new-instance v0, La9/g;

    .line 139
    .line 140
    const/4 v1, 0x7

    .line 141
    invoke-direct {v0, v1}, La9/g;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    sput-object v0, La9/i;->i:Lub/p;

    .line 149
    .line 150
    new-instance v0, La9/g;

    .line 151
    .line 152
    const/16 v1, 0x8

    .line 153
    .line 154
    invoke-direct {v0, v1}, La9/g;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sput-object v0, La9/i;->j:Lub/p;

    .line 162
    .line 163
    new-instance v0, La9/g;

    .line 164
    .line 165
    const/16 v1, 0x9

    .line 166
    .line 167
    invoke-direct {v0, v1}, La9/g;-><init>(I)V

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    sput-object v0, La9/i;->k:Lub/p;

    .line 175
    .line 176
    new-instance v0, La9/g;

    .line 177
    .line 178
    const/16 v1, 0xa

    .line 179
    .line 180
    invoke-direct {v0, v1}, La9/g;-><init>(I)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    sput-object v0, La9/i;->l:Lub/p;

    .line 188
    .line 189
    return-void
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

.method public static final a()Lcom/cnl/kikoeru/MainApplication;
    .locals 1

    .line 1
    sget-object v0, La9/i;->i:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/cnl/kikoeru/MainApplication;

    .line 8
    .line 9
    return-object v0
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

.method public static final b()Lh8/h;
    .locals 1

    .line 1
    sget-object v0, La9/i;->l:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lh8/h;

    .line 8
    .line 9
    return-object v0
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

.method public static final c()Lcom/cnl/kikoeru/data/db/AppDatabase;
    .locals 1

    .line 1
    sget-object v0, La9/i;->j:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 8
    .line 9
    return-object v0
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

.method public static final d()Lfg/f;
    .locals 1

    .line 1
    sget-object v0, La9/i;->g:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lfg/f;

    .line 8
    .line 9
    return-object v0
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

.method public static final e()Lfg/f;
    .locals 1

    .line 1
    sget-object v0, La9/i;->f:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lfg/f;

    .line 8
    .line 9
    return-object v0
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

.method public static final f()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, La9/i;->a:[Lpc/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    sget-object v1, La9/i;->c:Lhg/b;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lhg/b;->c(Lpc/u;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
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
