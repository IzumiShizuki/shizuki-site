.class public final synthetic Lca/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lx0/n2;


# direct methods
.method public synthetic constructor <init>(Lx0/n2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lca/c;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lca/c;->b:Lx0/n2;

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
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lca/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Lx0/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const/4 v1, 0x1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eq p2, v0, :cond_0

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p2, 0x0

    .line 25
    :goto_0
    and-int/2addr p1, v1

    .line 26
    invoke-virtual {v6, p1, p2}, Lx0/o;->N(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-static {}, Ln7/b0;->m()Lw1/f;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object p1, p0, Lca/c;->b:Lx0/n2;

    .line 37
    .line 38
    invoke-interface {p1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    const p1, -0x1c93c335

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, p1}, Lx0/o;->W(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6, v2}, Lx0/o;->p(Z)V

    .line 57
    .line 58
    .line 59
    sget-wide p1, Lq1/q;->e:J

    .line 60
    .line 61
    :goto_1
    move-wide v4, p1

    .line 62
    goto :goto_2

    .line 63
    :cond_1
    const p1, -0x1c93ba6b

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, p1}, Lx0/o;->W(I)V

    .line 67
    .line 68
    .line 69
    sget-object p1, Lm0/j1;->a:Lx0/z;

    .line 70
    .line 71
    invoke-virtual {v6, p1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lq1/q;

    .line 76
    .line 77
    iget-wide p1, p1, Lq1/q;->a:J

    .line 78
    .line 79
    sget-object v0, Lm0/h1;->a:Lx0/z;

    .line 80
    .line 81
    invoke-virtual {v6, v0}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Ljava/lang/Number;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-static {v0, p1, p2}, Lq1/q;->b(FJ)J

    .line 92
    .line 93
    .line 94
    move-result-wide p1

    .line 95
    invoke-virtual {v6, v2}, Lx0/o;->p(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :goto_2
    const/16 v7, 0x30

    .line 100
    .line 101
    const/4 v8, 0x4

    .line 102
    const-string v2, "Favorite"

    .line 103
    .line 104
    const/4 v3, 0x0

    .line 105
    invoke-static/range {v1 .. v8}, Lm0/r3;->b(Lw1/f;Ljava/lang/String;Lj1/q;JLx0/o;II)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_2
    invoke-virtual {v6}, Lx0/o;->Q()V

    .line 110
    .line 111
    .line 112
    :goto_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 113
    .line 114
    return-object p1

    .line 115
    :pswitch_0
    move-object v5, p1

    .line 116
    check-cast v5, Lx0/o;

    .line 117
    .line 118
    check-cast p2, Ljava/lang/Integer;

    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    and-int/lit8 p2, p1, 0x3

    .line 125
    .line 126
    const/4 v0, 0x2

    .line 127
    const/4 v1, 0x1

    .line 128
    if-eq p2, v0, :cond_3

    .line 129
    .line 130
    const/4 p2, 0x1

    .line 131
    goto :goto_4

    .line 132
    :cond_3
    const/4 p2, 0x0

    .line 133
    :goto_4
    and-int/2addr p1, v1

    .line 134
    invoke-virtual {v5, p1, p2}, Lx0/o;->N(IZ)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_4

    .line 139
    .line 140
    iget-object p1, p0, Lca/c;->b:Lx0/n2;

    .line 141
    .line 142
    invoke-interface {p1}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    move-object v0, p1

    .line 147
    check-cast v0, Lw1/f;

    .line 148
    .line 149
    const/16 v6, 0x30

    .line 150
    .line 151
    const/16 v7, 0xc

    .line 152
    .line 153
    const-string v1, "Play/Pause"

    .line 154
    .line 155
    const/4 v2, 0x0

    .line 156
    const-wide/16 v3, 0x0

    .line 157
    .line 158
    invoke-static/range {v0 .. v7}, Lm0/r3;->b(Lw1/f;Ljava/lang/String;Lj1/q;JLx0/o;II)V

    .line 159
    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_4
    invoke-virtual {v5}, Lx0/o;->Q()V

    .line 163
    .line 164
    .line 165
    :goto_5
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 166
    .line 167
    return-object p1

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
