.class public Lr5/s;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lr5/b0;


# instance fields
.field public final synthetic a:I

.field public final b:J

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lr5/s;->a:I

    const-wide/16 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, v1}, Lr5/s;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lr5/s;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-wide p1, p0, Lr5/s;->b:J

    .line 5
    new-instance p1, Lr5/a0;

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-nez p2, :cond_0

    .line 6
    sget-object p2, Lr5/c0;->c:Lr5/c0;

    goto :goto_0

    :cond_0
    new-instance p2, Lr5/c0;

    invoke-direct {p2, v0, v1, p3, p4}, Lr5/c0;-><init>(JJ)V

    .line 7
    :goto_0
    invoke-direct {p1, p2, p2}, Lr5/a0;-><init>(Lr5/c0;Lr5/c0;)V

    .line 8
    iput-object p1, p0, Lr5/s;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lr5/s;->a:I

    iput-object p1, p0, Lr5/s;->c:Ljava/lang/Object;

    iput-wide p2, p0, Lr5/s;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 1

    .line 1
    iget v0, p0, Lr5/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :pswitch_0
    const/4 v0, 0x0

    .line 9
    return v0

    .line 10
    :pswitch_1
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final k(J)Lr5/a0;
    .locals 13

    .line 1
    iget v0, p0, Lr5/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr5/s;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lt5/b;

    .line 9
    .line 10
    iget-object v1, v0, Lt5/b;->i:[Lt5/e;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aget-object v1, v1, v2

    .line 14
    .line 15
    invoke-virtual {v1, p1, p2}, Lt5/e;->b(J)Lr5/a0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x1

    .line 20
    :goto_0
    iget-object v3, v0, Lt5/b;->i:[Lt5/e;

    .line 21
    .line 22
    array-length v4, v3

    .line 23
    if-ge v2, v4, :cond_1

    .line 24
    .line 25
    aget-object v3, v3, v2

    .line 26
    .line 27
    invoke-virtual {v3, p1, p2}, Lt5/e;->b(J)Lr5/a0;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, v3, Lr5/a0;->a:Lr5/c0;

    .line 32
    .line 33
    iget-wide v4, v4, Lr5/c0;->b:J

    .line 34
    .line 35
    iget-object v6, v1, Lr5/a0;->a:Lr5/c0;

    .line 36
    .line 37
    iget-wide v6, v6, Lr5/c0;->b:J

    .line 38
    .line 39
    cmp-long v8, v4, v6

    .line 40
    .line 41
    if-gez v8, :cond_0

    .line 42
    .line 43
    move-object v1, v3

    .line 44
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-object v1

    .line 48
    :pswitch_0
    iget-object p1, p0, Lr5/s;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lr5/a0;

    .line 51
    .line 52
    return-object p1

    .line 53
    :pswitch_1
    iget-object v0, p0, Lr5/s;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lr5/t;

    .line 56
    .line 57
    iget-object v1, v0, Lr5/t;->k:Lm0/w;

    .line 58
    .line 59
    invoke-static {v1}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v1, v0, Lr5/t;->k:Lm0/w;

    .line 63
    .line 64
    iget-object v2, v1, Lm0/w;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, [J

    .line 67
    .line 68
    iget-object v1, v1, Lm0/w;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, [J

    .line 71
    .line 72
    iget v3, v0, Lr5/t;->e:I

    .line 73
    .line 74
    int-to-long v3, v3

    .line 75
    mul-long v3, v3, p1

    .line 76
    .line 77
    const-wide/32 v5, 0xf4240

    .line 78
    .line 79
    .line 80
    div-long v7, v3, v5

    .line 81
    .line 82
    iget-wide v3, v0, Lr5/t;->j:J

    .line 83
    .line 84
    const-wide/16 v9, 0x1

    .line 85
    .line 86
    sub-long v11, v3, v9

    .line 87
    .line 88
    const-wide/16 v9, 0x0

    .line 89
    .line 90
    invoke-static/range {v7 .. v12}, Lp4/c0;->j(JJJ)J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    const/4 v7, 0x0

    .line 95
    invoke-static {v2, v3, v4, v7}, Lp4/c0;->e([JJZ)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    const-wide/16 v7, 0x0

    .line 100
    .line 101
    const/4 v4, -0x1

    .line 102
    if-ne v3, v4, :cond_2

    .line 103
    .line 104
    move-wide v9, v7

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    aget-wide v9, v2, v3

    .line 107
    .line 108
    :goto_1
    if-ne v3, v4, :cond_3

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    aget-wide v7, v1, v3

    .line 112
    .line 113
    :goto_2
    mul-long v9, v9, v5

    .line 114
    .line 115
    iget v0, v0, Lr5/t;->e:I

    .line 116
    .line 117
    int-to-long v11, v0

    .line 118
    div-long/2addr v9, v11

    .line 119
    iget-wide v11, p0, Lr5/s;->b:J

    .line 120
    .line 121
    add-long/2addr v7, v11

    .line 122
    new-instance v4, Lr5/c0;

    .line 123
    .line 124
    invoke-direct {v4, v9, v10, v7, v8}, Lr5/c0;-><init>(JJ)V

    .line 125
    .line 126
    .line 127
    cmp-long v7, v9, p1

    .line 128
    .line 129
    if-eqz v7, :cond_5

    .line 130
    .line 131
    array-length p1, v2

    .line 132
    add-int/lit8 p1, p1, -0x1

    .line 133
    .line 134
    if-ne v3, p1, :cond_4

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 138
    .line 139
    aget-wide p1, v2, v3

    .line 140
    .line 141
    aget-wide v2, v1, v3

    .line 142
    .line 143
    mul-long p1, p1, v5

    .line 144
    .line 145
    int-to-long v0, v0

    .line 146
    div-long/2addr p1, v0

    .line 147
    add-long/2addr v11, v2

    .line 148
    new-instance v0, Lr5/c0;

    .line 149
    .line 150
    invoke-direct {v0, p1, p2, v11, v12}, Lr5/c0;-><init>(JJ)V

    .line 151
    .line 152
    .line 153
    new-instance p1, Lr5/a0;

    .line 154
    .line 155
    invoke-direct {p1, v4, v0}, Lr5/a0;-><init>(Lr5/c0;Lr5/c0;)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_5
    :goto_3
    new-instance p1, Lr5/a0;

    .line 160
    .line 161
    invoke-direct {p1, v4, v4}, Lr5/a0;-><init>(Lr5/c0;Lr5/c0;)V

    .line 162
    .line 163
    .line 164
    :goto_4
    return-object p1

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final m()J
    .locals 2

    .line 1
    iget v0, p0, Lr5/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lr5/s;->b:J

    .line 7
    .line 8
    return-wide v0

    .line 9
    :pswitch_0
    iget-wide v0, p0, Lr5/s;->b:J

    .line 10
    .line 11
    return-wide v0

    .line 12
    :pswitch_1
    iget-object v0, p0, Lr5/s;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lr5/t;

    .line 15
    .line 16
    invoke-virtual {v0}, Lr5/t;->b()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    return-wide v0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
