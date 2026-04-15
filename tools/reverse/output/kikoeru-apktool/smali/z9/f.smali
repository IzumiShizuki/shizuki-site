.class public final synthetic Lz9/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lz9/r;

.field public final synthetic c:Lhf/y;


# direct methods
.method public synthetic constructor <init>(Lz9/r;Lhf/y;I)V
    .locals 0

    .line 1
    iput p3, p0, Lz9/f;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lz9/f;->b:Lz9/r;

    .line 4
    .line 5
    iput-object p2, p0, Lz9/f;->c:Lhf/y;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lz9/f;->a:I

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
    if-eq p2, v0, :cond_0

    .line 20
    .line 21
    const/4 p2, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p2, 0x0

    .line 24
    :goto_0
    and-int/2addr p1, v1

    .line 25
    invoke-virtual {v6, p1, p2}, Lx0/o;->N(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget-object p1, p0, Lz9/f;->b:Lz9/r;

    .line 32
    .line 33
    invoke-virtual {v6, p1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iget-object v0, p0, Lz9/f;->c:Lhf/y;

    .line 38
    .line 39
    invoke-virtual {v6, v0}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    or-int/2addr p2, v1

    .line 44
    invoke-virtual {v6}, Lx0/o;->K()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-nez p2, :cond_1

    .line 49
    .line 50
    sget-object p2, Lx0/k;->a:Lx0/r0;

    .line 51
    .line 52
    if-ne v1, p2, :cond_2

    .line 53
    .line 54
    :cond_1
    new-instance v1, Lz9/g;

    .line 55
    .line 56
    const/4 p2, 0x1

    .line 57
    invoke-direct {v1, p1, v0, p2}, Lz9/g;-><init>(Lz9/r;Lhf/y;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    check-cast v1, Lic/a;

    .line 64
    .line 65
    const/high16 v7, 0x30000000

    .line 66
    .line 67
    const/16 v8, 0x1fe

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    const/4 v3, 0x0

    .line 71
    const/4 v4, 0x0

    .line 72
    sget-object v5, Lz9/a;->i:Lf1/f;

    .line 73
    .line 74
    invoke-static/range {v1 .. v8}, Landroid/support/v4/media/session/b;->o(Lic/a;Lj1/q;ZLm0/k1;Lic/o;Lx0/o;II)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-virtual {v6}, Lx0/o;->Q()V

    .line 79
    .line 80
    .line 81
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_0
    move-object v5, p1

    .line 85
    check-cast v5, Lx0/o;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    and-int/lit8 p2, p1, 0x3

    .line 94
    .line 95
    const/4 v0, 0x2

    .line 96
    const/4 v1, 0x1

    .line 97
    if-eq p2, v0, :cond_4

    .line 98
    .line 99
    const/4 p2, 0x1

    .line 100
    goto :goto_2

    .line 101
    :cond_4
    const/4 p2, 0x0

    .line 102
    :goto_2
    and-int/2addr p1, v1

    .line 103
    invoke-virtual {v5, p1, p2}, Lx0/o;->N(IZ)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_7

    .line 108
    .line 109
    iget-object p1, p0, Lz9/f;->b:Lz9/r;

    .line 110
    .line 111
    invoke-virtual {v5, p1}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    iget-object v0, p0, Lz9/f;->c:Lhf/y;

    .line 116
    .line 117
    invoke-virtual {v5, v0}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    or-int/2addr p2, v1

    .line 122
    invoke-virtual {v5}, Lx0/o;->K()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-nez p2, :cond_5

    .line 127
    .line 128
    sget-object p2, Lx0/k;->a:Lx0/r0;

    .line 129
    .line 130
    if-ne v1, p2, :cond_6

    .line 131
    .line 132
    :cond_5
    new-instance v1, Lz9/g;

    .line 133
    .line 134
    const/4 p2, 0x2

    .line 135
    invoke-direct {v1, p1, v0, p2}, Lz9/g;-><init>(Lz9/r;Lhf/y;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_6
    move-object v0, v1

    .line 142
    check-cast v0, Lic/a;

    .line 143
    .line 144
    const/high16 v6, 0x30000000

    .line 145
    .line 146
    const/16 v7, 0x1fe

    .line 147
    .line 148
    const/4 v1, 0x0

    .line 149
    const/4 v2, 0x0

    .line 150
    const/4 v3, 0x0

    .line 151
    sget-object v4, Lz9/a;->l:Lf1/f;

    .line 152
    .line 153
    invoke-static/range {v0 .. v7}, Landroid/support/v4/media/session/b;->o(Lic/a;Lj1/q;ZLm0/k1;Lic/o;Lx0/o;II)V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_7
    invoke-virtual {v5}, Lx0/o;->Q()V

    .line 158
    .line 159
    .line 160
    :goto_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 161
    .line 162
    return-object p1

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
