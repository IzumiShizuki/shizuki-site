.class public final synthetic Lca/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Le7/a0;


# direct methods
.method public synthetic constructor <init>(Le7/a0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lca/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lca/b;->b:Le7/a0;

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
    .locals 5

    .line 1
    iget v0, p0, Lca/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lca/b;->b:Le7/a0;

    .line 7
    .line 8
    const-string v1, "LoginScreen"

    .line 9
    .line 10
    invoke-static {v0, v1}, Le7/a0;->b(Le7/a0;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Lca/b;->b:Le7/a0;

    .line 17
    .line 18
    invoke-virtual {v0}, Le7/a0;->c()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_1
    invoke-static {}, Lh9/d;->g()Lh9/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-wide v0, v0, Lh9/b;->a:J

    .line 31
    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v3, "MusicScreen/"

    .line 35
    .line 36
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Lca/b;->b:Le7/a0;

    .line 47
    .line 48
    invoke-static {v1, v0}, Le7/a0;->b(Le7/a0;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_2
    iget-object v0, p0, Lca/b;->b:Le7/a0;

    .line 55
    .line 56
    invoke-virtual {v0}, Le7/a0;->c()V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_3
    new-instance v0, Le7/b0;

    .line 63
    .line 64
    iget-object v1, p0, Lca/b;->b:Le7/a0;

    .line 65
    .line 66
    iget-object v2, v1, Le7/a0;->a:Landroid/content/Context;

    .line 67
    .line 68
    iget-object v1, v1, Le7/a0;->b:Lh7/g;

    .line 69
    .line 70
    iget-object v1, v1, Lh7/g;->s:Le7/n0;

    .line 71
    .line 72
    const-string v3, "context"

    .line 73
    .line 74
    invoke-static {v2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v2, "navigatorProvider"

    .line 78
    .line 79
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_4
    iget-object v0, p0, Lca/b;->b:Le7/a0;

    .line 87
    .line 88
    iget-object v1, v0, Le7/a0;->f:Ld/k0;

    .line 89
    .line 90
    iget-boolean v2, v0, Le7/a0;->g:Z

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    iget-object v0, v0, Le7/a0;->b:Lh7/g;

    .line 96
    .line 97
    iget-object v0, v0, Lh7/g;->f:Lvb/j;

    .line 98
    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    invoke-virtual {v0}, Lvb/j;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_1

    .line 106
    .line 107
    const/4 v2, 0x0

    .line 108
    goto :goto_1

    .line 109
    :cond_1
    invoke-virtual {v0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const/4 v2, 0x0

    .line 114
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_4

    .line 119
    .line 120
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    check-cast v4, Le7/j;

    .line 125
    .line 126
    iget-object v4, v4, Le7/j;->b:Le7/u;

    .line 127
    .line 128
    instance-of v4, v4, Le7/w;

    .line 129
    .line 130
    if-nez v4, :cond_2

    .line 131
    .line 132
    add-int/lit8 v2, v2, 0x1

    .line 133
    .line 134
    if-ltz v2, :cond_3

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 138
    .line 139
    const-string v1, "Count overflow has happened."

    .line 140
    .line 141
    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v0

    .line 145
    :cond_4
    :goto_1
    const/4 v0, 0x1

    .line 146
    if-le v2, v0, :cond_5

    .line 147
    .line 148
    const/4 v3, 0x1

    .line 149
    :cond_5
    iput-boolean v3, v1, Ld/b0;->a:Z

    .line 150
    .line 151
    iget-object v0, v1, Ld/b0;->c:Ljc/j;

    .line 152
    .line 153
    if-eqz v0, :cond_6

    .line 154
    .line 155
    invoke-interface {v0}, Lic/a;->b()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    :cond_6
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_5
    iget-object v0, p0, Lca/b;->b:Le7/a0;

    .line 162
    .line 163
    const-string v1, "PlayingScreen"

    .line 164
    .line 165
    invoke-static {v0, v1}, Le7/a0;->b(Le7/a0;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 169
    .line 170
    return-object v0

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
