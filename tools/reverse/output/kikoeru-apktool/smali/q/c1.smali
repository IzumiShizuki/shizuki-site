.class public final Lq/c1;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lq/e1;

.field public final synthetic d:Lg2/g1;


# direct methods
.method public synthetic constructor <init>(Lq/e1;Lg2/g1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lq/c1;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lq/c1;->c:Lq/e1;

    .line 4
    .line 5
    iput-object p2, p0, Lq/c1;->d:Lg2/g1;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
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
    .line 59
    .line 60
    .line 61
    .line 62
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lq/c1;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lg2/f1;

    .line 7
    .line 8
    iget-object v0, p0, Lq/c1;->c:Lq/e1;

    .line 9
    .line 10
    iget-object v1, v0, Lq/e1;->o:Lq/h1;

    .line 11
    .line 12
    invoke-virtual {v1}, Lq/h1;->g()Lq/g1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lq/g1;->c()Lp1/c;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v1, v0, Lq/e1;->o:Lq/h1;

    .line 23
    .line 24
    invoke-virtual {v1}, Lq/h1;->f()Lq/x;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, v0, Lq/e1;->o:Lq/h1;

    .line 29
    .line 30
    invoke-virtual {v2}, Lq/h1;->g()Lq/g1;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Lq/g1;->a()Lp1/c;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, Lq/e1;->o:Lq/h1;

    .line 42
    .line 43
    invoke-virtual {v3}, Lq/h1;->g()Lq/g1;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Lq/g1;->c()Lp1/c;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2, v3}, Lq/x;->a(Lp1/c;Lp1/c;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    iget-object v1, v0, Lq/e1;->o:Lq/h1;

    .line 58
    .line 59
    invoke-virtual {v1}, Lq/h1;->f()Lq/x;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Lq/x;->c()Lp1/c;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p1}, Lg2/f1;->d()Lg2/c0;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const/4 v3, 0x0

    .line 72
    const-wide/16 v4, 0x0

    .line 73
    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    iget-object v6, v0, Lq/e1;->o:Lq/h1;

    .line 77
    .line 78
    invoke-virtual {v6}, Lq/h1;->g()Lq/g1;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    iget-object v6, v6, Lq/g1;->b:Lq/q1;

    .line 83
    .line 84
    iget-object v6, v6, Lq/q1;->g:Lg2/c0;

    .line 85
    .line 86
    if-eqz v6, :cond_1

    .line 87
    .line 88
    invoke-interface {v6, v2, v4, v5}, Lg2/c0;->o(Lg2/c0;J)J

    .line 89
    .line 90
    .line 91
    move-result-wide v2

    .line 92
    new-instance v6, Lp1/b;

    .line 93
    .line 94
    invoke-direct {v6, v2, v3}, Lp1/b;-><init>(J)V

    .line 95
    .line 96
    .line 97
    move-object v3, v6

    .line 98
    goto :goto_0

    .line 99
    :cond_1
    const-string p1, "root"

    .line 100
    .line 101
    invoke-static {p1}, Ljc/l;->k(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v3

    .line 105
    :cond_2
    :goto_0
    if-eqz v1, :cond_4

    .line 106
    .line 107
    iget-object v2, v0, Lq/e1;->o:Lq/h1;

    .line 108
    .line 109
    invoke-virtual {v2}, Lq/h1;->f()Lq/x;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2}, Lq/x;->b()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_3

    .line 118
    .line 119
    iget-object v0, v0, Lq/e1;->o:Lq/h1;

    .line 120
    .line 121
    invoke-virtual {v0}, Lq/h1;->g()Lq/g1;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v0, v0, Lq/g1;->e:Lx0/e1;

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_3
    invoke-virtual {v1}, Lp1/c;->d()J

    .line 131
    .line 132
    .line 133
    move-result-wide v0

    .line 134
    goto :goto_1

    .line 135
    :cond_4
    iget-object v1, v0, Lq/e1;->o:Lq/h1;

    .line 136
    .line 137
    invoke-virtual {v1}, Lq/h1;->f()Lq/x;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Lq/x;->b()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_5

    .line 146
    .line 147
    invoke-virtual {p1}, Lg2/f1;->d()Lg2/c0;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    if-eqz v1, :cond_5

    .line 152
    .line 153
    invoke-static {v0, v1}, Lq/e1;->B0(Lq/e1;Lg2/c0;)V

    .line 154
    .line 155
    .line 156
    :cond_5
    iget-object v0, v0, Lq/e1;->o:Lq/h1;

    .line 157
    .line 158
    invoke-virtual {v0}, Lq/h1;->g()Lq/g1;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Lq/g1;->a()Lp1/c;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Lp1/c;->d()J

    .line 170
    .line 171
    .line 172
    move-result-wide v0

    .line 173
    :goto_1
    if-eqz v3, :cond_6

    .line 174
    .line 175
    iget-wide v2, v3, Lp1/b;->a:J

    .line 176
    .line 177
    invoke-static {v0, v1, v2, v3}, Lp1/b;->h(JJ)J

    .line 178
    .line 179
    .line 180
    move-result-wide v4

    .line 181
    :cond_6
    const/16 v0, 0x20

    .line 182
    .line 183
    shr-long v0, v4, v0

    .line 184
    .line 185
    long-to-int v1, v0

    .line 186
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    const-wide v1, 0xffffffffL

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    and-long/2addr v1, v4

    .line 196
    long-to-int v2, v1

    .line 197
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    const/4 v2, 0x0

    .line 210
    iget-object v3, p0, Lq/c1;->d:Lg2/g1;

    .line 211
    .line 212
    invoke-virtual {p1, v3, v0, v1, v2}, Lg2/f1;->h(Lg2/g1;IIF)V

    .line 213
    .line 214
    .line 215
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 216
    .line 217
    return-object p1

    .line 218
    :pswitch_0
    check-cast p1, Lg2/f1;

    .line 219
    .line 220
    invoke-virtual {p1}, Lg2/f1;->d()Lg2/c0;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-eqz v0, :cond_7

    .line 225
    .line 226
    iget-object v1, p0, Lq/c1;->c:Lq/e1;

    .line 227
    .line 228
    invoke-static {v1, v0}, Lq/e1;->B0(Lq/e1;Lg2/c0;)V

    .line 229
    .line 230
    .line 231
    :cond_7
    iget-object v0, p0, Lq/c1;->d:Lg2/g1;

    .line 232
    .line 233
    const/4 v1, 0x0

    .line 234
    const/4 v2, 0x0

    .line 235
    invoke-virtual {p1, v0, v2, v2, v1}, Lg2/f1;->h(Lg2/g1;IIF)V

    .line 236
    .line 237
    .line 238
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 239
    .line 240
    return-object p1

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
