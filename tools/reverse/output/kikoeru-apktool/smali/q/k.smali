.class public final Lq/k;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lq/l;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lq/l;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lq/k;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lq/k;->c:Lq/l;

    .line 4
    .line 5
    iput-wide p2, p0, Lq/k;->d:J

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
    .locals 8

    .line 1
    iget v0, p0, Lq/k;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq/k;->c:Lq/l;

    .line 7
    .line 8
    iget-object v1, v0, Lq/l;->q:Lq/m;

    .line 9
    .line 10
    invoke-virtual {v1}, Lq/m;->a()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {p1, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-wide v1, v0, Lq/l;->r:J

    .line 21
    .line 22
    sget-wide v3, Landroidx/compose/animation/a;->a:J

    .line 23
    .line 24
    invoke-static {v1, v2, v3, v4}, Lf3/l;->b(JJ)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-wide v0, p0, Lq/k;->d:J

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-wide v0, v0, Lq/l;->r:J

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, v0, Lq/l;->q:Lq/m;

    .line 37
    .line 38
    iget-object v0, v0, Lq/m;->d:Lo/k0;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lx0/n2;

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    invoke-interface {p1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lf3/l;

    .line 53
    .line 54
    iget-wide v0, p1, Lf3/l;->a:J

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const-wide/16 v0, 0x0

    .line 58
    .line 59
    :goto_0
    new-instance p1, Lf3/l;

    .line 60
    .line 61
    invoke-direct {p1, v0, v1}, Lf3/l;-><init>(J)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_0
    check-cast p1, Lr/k1;

    .line 66
    .line 67
    invoke-interface {p1}, Lr/k1;->a()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v1, p0, Lq/k;->c:Lq/l;

    .line 72
    .line 73
    iget-object v2, v1, Lq/l;->q:Lq/m;

    .line 74
    .line 75
    invoke-virtual {v2}, Lq/m;->a()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v0, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    const-wide/16 v2, 0x0

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    iget-wide v4, v1, Lq/l;->r:J

    .line 88
    .line 89
    sget-wide v6, Landroidx/compose/animation/a;->a:J

    .line 90
    .line 91
    invoke-static {v4, v5, v6, v7}, Lf3/l;->b(JJ)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    iget-wide v4, p0, Lq/k;->d:J

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    iget-wide v4, v1, Lq/l;->r:J

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    iget-object v0, v1, Lq/l;->q:Lq/m;

    .line 104
    .line 105
    iget-object v0, v0, Lq/m;->d:Lo/k0;

    .line 106
    .line 107
    invoke-interface {p1}, Lr/k1;->a()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-virtual {v0, v4}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Lx0/n2;

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    invoke-interface {v0}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lf3/l;

    .line 124
    .line 125
    iget-wide v4, v0, Lf3/l;->a:J

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_5
    move-wide v4, v2

    .line 129
    :goto_1
    iget-object v0, v1, Lq/l;->q:Lq/m;

    .line 130
    .line 131
    iget-object v0, v0, Lq/m;->d:Lo/k0;

    .line 132
    .line 133
    invoke-interface {p1}, Lr/k1;->c()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {v0, p1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Lx0/n2;

    .line 142
    .line 143
    if-eqz p1, :cond_6

    .line 144
    .line 145
    invoke-interface {p1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    check-cast p1, Lf3/l;

    .line 150
    .line 151
    iget-wide v2, p1, Lf3/l;->a:J

    .line 152
    .line 153
    :cond_6
    iget-object p1, v1, Lq/l;->p:Lx0/w0;

    .line 154
    .line 155
    invoke-interface {p1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, Lq/v1;

    .line 160
    .line 161
    if-eqz p1, :cond_7

    .line 162
    .line 163
    iget-object p1, p1, Lq/v1;->a:Lic/n;

    .line 164
    .line 165
    new-instance v0, Lf3/l;

    .line 166
    .line 167
    invoke-direct {v0, v4, v5}, Lf3/l;-><init>(J)V

    .line 168
    .line 169
    .line 170
    new-instance v1, Lf3/l;

    .line 171
    .line 172
    invoke-direct {v1, v2, v3}, Lf3/l;-><init>(J)V

    .line 173
    .line 174
    .line 175
    invoke-interface {p1, v0, v1}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    check-cast p1, Lr/x;

    .line 180
    .line 181
    if-nez p1, :cond_8

    .line 182
    .line 183
    :cond_7
    const/4 p1, 0x5

    .line 184
    const/4 v0, 0x0

    .line 185
    invoke-static {p1, v0}, Lr/d;->q(ILjava/lang/Object;)Lr/z0;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    :cond_8
    return-object p1

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
